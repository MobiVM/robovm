package org.robovm.compiler.plugin.debug.kotlin;

import org.robovm.compiler.plugin.debug.DebugInformationPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dkimitsa
 * helper file to deal with kotlin stuff
 */
public class KotlinTools {

    // VO to keep range information
    private static class Range {
        private final int originalIndex;
        private final int targetIndexStart;
        private final int targetIndexEnd;

        Range(int originalIndex, int targetIndexStart, int targetIndexEnd) {
            this.originalIndex = originalIndex;
            this.targetIndexStart = targetIndexStart;
            this.targetIndexEnd = targetIndexEnd;
        }
    }

    // string constants to parse
    private final static String DEBUG_SECTION = "*S KotlinDebug";
    private final static String FILE_SECTION = "*F";
    private final static String LINE_SECTION = "*L";
    private final static String END = "*E";

    /**
     * parses SMAP data and return line number mapper to handle kotlin remaps
     * parsing is based on original kotlin sources:
     * kotlin/compiler/backend/src/org/jetbrains/kotlin/codegen/inline/SMAPParser.kt
     */
    public static DebugInformationPlugin.LineNumberMapper parseSMAP(byte[] smapData, String internalName) {
        String mappingInfo = new String(smapData);
        List<Range> lineMappings = new ArrayList<>();

        int debugSectionStart = mappingInfo.indexOf(DEBUG_SECTION);
        if (debugSectionStart < 0)
            return DebugInformationPlugin.LineNumberMapper.DIRECT;

        // interested only in debug section
        mappingInfo = mappingInfo.substring(debugSectionStart + DEBUG_SECTION.length());

        int fileSectionStart = mappingInfo.indexOf(FILE_SECTION) + FILE_SECTION.length();
        int lineSectionAnchor = mappingInfo.indexOf(LINE_SECTION);

        String files = mappingInfo.substring(fileSectionStart, lineSectionAnchor);
        String[] fileEntries = files.trim().split("\\+");

        // look only for mapping of own file
        int ownFileIndex = -1;
        for (String fileDeclaration : fileEntries) {
            String fileInternalName = fileDeclaration.trim();
            if (fileInternalName.isEmpty())
                continue;

            int indexEnd = fileInternalName.indexOf(' ');
            int index = Integer.parseInt(fileInternalName.substring(0, indexEnd));
            int newLine = fileInternalName.indexOf('\n');

            fileInternalName = fileInternalName.substring(newLine + 1).trim();
            if (fileInternalName.equals(internalName)) {
                ownFileIndex = index;
                break;
            }
        }


        if (ownFileIndex == -1)
            return DebugInformationPlugin.LineNumberMapper.DIRECT;

        String[] lines = mappingInfo.substring(lineSectionAnchor + LINE_SECTION.length(), mappingInfo.indexOf(END)).trim().split("\\n");
        int minTargetIndex = Integer.MAX_VALUE;
        int maxTargetIndex = Integer.MIN_VALUE;
        for (String lineMapping : lines) {
            /*only simple mapping now*/
            int targetSplit = lineMapping.indexOf(':');
            String originalPart = lineMapping.substring(0, targetSplit);
            int rangeSeparator = originalPart.indexOf(',');
            if (rangeSeparator < 0)
                rangeSeparator = targetSplit;

            int fileSeparator = lineMapping.indexOf('#');
            int fileIndex = Integer.parseInt(lineMapping.substring(fileSeparator + 1, rangeSeparator));
            if (fileIndex != ownFileIndex)
                continue;

            int originalIndex = Integer.parseInt(originalPart.substring(0, fileSeparator));
            int range;
            if (rangeSeparator == targetSplit)
                range = 1;
            else
                range = Integer.parseInt(originalPart.substring(rangeSeparator + 1, targetSplit));
            int targetIndex = Integer.parseInt(lineMapping.substring(targetSplit + 1));

            // get min/max values for optimization
            if (targetIndex < minTargetIndex)
                minTargetIndex = targetIndex;
            if (targetIndex + range - 1 > maxTargetIndex)
                maxTargetIndex = targetIndex + range - 1;

            lineMappings.add(new Range(originalIndex, targetIndex, targetIndex + range - 1));
        }

        if (lineMappings.size() == 1) {
            // simple case with one entry
            Range r = lineMappings.get(0);
            int targetIndexStart = r.targetIndexStart;
            int targetIndexEnd = r.targetIndexEnd;
            int originalIndex = r.originalIndex;
            return (l) -> {
                if (l >= targetIndexStart && l <= targetIndexEnd)
                    return originalIndex + l - targetIndexStart;
                else
                    return l;
            };
        } else if (lineMappings.size() > 1) {
            // complex case, check all range entries

            int minLine = minTargetIndex;
            int maxLine = maxTargetIndex;
            return (l) -> {
                if (l >= minLine && l <= maxLine) {
                    for (Range r : lineMappings) {
                        if (l >= r.targetIndexStart && l <= r.targetIndexEnd)
                            return r.originalIndex + l - r.targetIndexStart;
                    }
                }

                // not found
                return l;
            };
        }

        // there seems to be no entries at all, return direct mapping
        return DebugInformationPlugin.LineNumberMapper.DIRECT;
    }

}

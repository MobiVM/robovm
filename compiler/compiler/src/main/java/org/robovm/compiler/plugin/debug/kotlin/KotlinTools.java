package org.robovm.compiler.plugin.debug.kotlin;

import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.debug.DebugInformationPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dkimitsa
 * helper file to deal with kotlin stuff
 */
public class KotlinTools {

    // VO to keep range information
    static class Range {
        final int originalIndex;
        final int targetIndexStart;
        final int targetIndexEnd;

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
    public static DebugInformationPlugin.LineNumberMapper parseSMAP(Config config, byte[] smapData, String internalName) {
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
            try {
                Range range = parseLineMap(ownFileIndex, lineMapping);

                // get min/max values for optimization
                if (range.targetIndexStart < minTargetIndex)
                    minTargetIndex = range.targetIndexStart;
                if (range.targetIndexEnd > maxTargetIndex)
                    maxTargetIndex = range.targetIndexEnd;

                lineMappings.add(range);
            } catch (Throwable e) {
                if (config.getHome().isDev())
                    config.getLogger().warn(e.getLocalizedMessage());
            }
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

    static Range parseLineMap(int expectedFileIndex, String lineMapping) {
        // In KotlinDebug, they use `1#2,3:4` to mean "map lines 4..6 to line 1 of #2", when in reality (and i
        // the non-debug stratum) this maps lines 4..6 to lines 1..3. The correct syntax is `1#2:4,3`.
        // multiple options:
        // case 1: "$source#$fileId:$dest\n"
        // case 2: "$source#$fileId:$dest,$range"
        // case 3: "$source#$fileId,$range:$dest"
        int fileSeparatorIdx = lineMapping.indexOf('#');
        if (fileSeparatorIdx <= 0)
            throw new IllegalArgumentException("fileId(#) separator not found in " + lineMapping);

        // get positions of other separators
        int semicolonIdx = lineMapping.indexOf(':', fileSeparatorIdx + 1);
        if (semicolonIdx < fileSeparatorIdx + 2)
            throw new IllegalArgumentException("fileId(:) separator not found or empty in " + lineMapping);
        int commaIdx = lineMapping.indexOf(',', fileSeparatorIdx + 1);
        if (commaIdx > 0 && commaIdx < fileSeparatorIdx + 2)
            throw new IllegalArgumentException("range(,) separator is empty in " + lineMapping);

        // parse values
        int originalIndex = Integer.parseInt(lineMapping.substring(0, fileSeparatorIdx));
        int fileIndex;
        int range;
        int dest;

        if (commaIdx < 0) {
            // case 1: "$source#$fileId:$dest\n"
            fileIndex = Integer.parseInt(lineMapping.substring(fileSeparatorIdx + 1, semicolonIdx));
            dest = Integer.parseInt(lineMapping.substring(semicolonIdx + 1));
            range = 1;
        } else {
            if (commaIdx > semicolonIdx + 1) {
                // case 2: "$source#$fileId:$dest,$range"
                fileIndex = Integer.parseInt(lineMapping.substring(fileSeparatorIdx + 1, semicolonIdx));
                dest = Integer.parseInt(lineMapping.substring(semicolonIdx + 1, commaIdx));
                range = Integer.parseInt(lineMapping.substring(commaIdx + 1));
            } else if (semicolonIdx > commaIdx + 1){
                // case 3: "$source#$fileId,$range:$dest"
                fileIndex = Integer.parseInt(lineMapping.substring(fileSeparatorIdx + 1, commaIdx));
                dest = Integer.parseInt(lineMapping.substring(semicolonIdx + 1));
                range = Integer.parseInt(lineMapping.substring(commaIdx + 1, semicolonIdx));
            } else {
                // comma or semicolon next to each other
                throw new IllegalArgumentException("Empty range/dest in " + lineMapping);
            }
        }
        if (fileIndex != expectedFileIndex)
            throw new IllegalArgumentException("fileIndex doesn't match expected " + expectedFileIndex + " in " + lineMapping);

        return new Range(originalIndex, dest, dest + range - 1);
    }
}

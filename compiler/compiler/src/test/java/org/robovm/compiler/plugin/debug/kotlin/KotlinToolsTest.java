package org.robovm.compiler.plugin.debug.kotlin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test SMAP related apis
 */
public class KotlinToolsTest {
    // In KotlinDebug, they use `1#2,3:4` to mean "map lines 4..6 to line 1 of #2", when in reality (and i
    // the non-debug stratum) this maps lines 4..6 to lines 1..3. The correct syntax is `1#2:4,3`.
    // multiple options:
    // case 1: "$source#$fileId:$dest\n"
    // case 2: "$source#$fileId:$dest,$range"
    // case 3: "$source#$fileId,$range:$dest"

    @Test
    public void testParseLineMapCase1() {
        // case 1: "$source#$fileId:$dest\n"
        String lineMapping = "1#2:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
        assertEquals(1, range.originalIndex);
        assertEquals(4, range.targetIndexStart);
        assertEquals(4, range.targetIndexEnd);
    }

    @Test
    public void testParseLineMapCase2() {
        // case 2: "$source#$fileId:$dest,$range"
        String lineMapping = "1#2:4,3";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
        assertEquals(1, range.originalIndex);
        assertEquals(4, range.targetIndexStart);
        assertEquals(6, range.targetIndexEnd);
    }

    @Test
    public void testParseLineMapCase3() {
        // case 3: "$source#$fileId,$range:$dest"
        String lineMapping = "1#2,3:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
        assertEquals(1, range.originalIndex);
        assertEquals(4, range.targetIndexStart);
        assertEquals(6, range.targetIndexEnd);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMapFailsOnFileIdMismatch() {
        String lineMapping = "1#4,3:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMapFailsOriginalIdxMissingCase1() {
        String lineMapping = "#2:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMapFailsOriginalIdxMissingCase2() {
        String lineMapping = "#2:4,3";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMapFailsOriginalIdxMissingCase3() {
        String lineMapping = "#2,3:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsFileIdMissingCase1() {
        String lineMapping = "1#:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsFileIdMissingCase2() {
        String lineMapping = "1#:4,3";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsFileIdMissingCase3() {
        String lineMapping = "1#,3:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsDestMissingCase1() {
        String lineMapping = "1#2:";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsDestMissingCase2() {
        String lineMapping = "1#2:,3";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsDestMissingCase3() {
        String lineMapping = "1#2,3:";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsRangeMissingCase2() {
        String lineMapping = "1#2:4,";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseLineMaFailsRangeMissingCase3() {
        String lineMapping = "1#2,:4";
        KotlinTools.Range range = KotlinTools.parseLineMap(2, lineMapping);
    }
}
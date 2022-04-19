package org.robovm.debugger.utils.macho.tools;

import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/**
 * trie structures walker, such as export symbol tries
 */
public final class Trie {
    public interface TrieIterator {
        // called for trie final node, should return true to continue walk
        boolean handle(String name, DataBufferReader data, int size);
    }

    public interface Mapper<T> {
        // mapper for find interface to map data buffer into expected data
        T map(DataBufferReader data, int size);
    }


    /**
     * walks through all children of node
     */
    private static boolean walkNode(DataBufferReader trie,
                                    Set<Long> visitedNodeOffsets,
                                    String nodeName,
                                    Predicate<String> shouldContinueToChild,
                                    TrieIterator iterator) {
        visitedNodeOffsets.add(trie.position());
        long terminalSize = trie.readUleb128();
        if (terminalSize != 0) {
            // pointing to symbol data
            long savedPos = trie.position();
            if (!iterator.handle(nodeName, trie, (int) terminalSize))
                return false;
            trie.setPosition(savedPos + terminalSize);
        }

        byte childrenCount = trie.readByte();
        for (; childrenCount > 0; childrenCount--) {
            String childSuffix = trie.readStringZ();
            String childName = nodeName + childSuffix;
            long nodeOffset = trie.readUleb128();
            if (shouldContinueToChild.test(childName)) {
                long savedPos = trie.position();
                trie.setPosition(nodeOffset);
                if (!walkNode(trie, visitedNodeOffsets, childName, shouldContinueToChild, iterator))
                    return false;
                trie.setPosition(savedPos);
            }
        }

        return true;
    }

    public static void forEach(DataBufferReader trie, TrieIterator iterator) {
        Set<Long> visitedNodeOffsets = new HashSet<>();
        walkNode(trie, visitedNodeOffsets, "", (name) -> true, iterator);
    }

    public static <T> T find(DataBufferReader trie, String key, Mapper<T> mapper) {
        Set<Long> visitedNodeOffsets = new HashSet<>();
        final Object[] result = new Object[]{null};
        walkNode(trie, visitedNodeOffsets, "", key::startsWith, (name, data, size) -> {
            if (name.equals(key)) {
                result[0] = mapper.map(data, size);
                // don't continue
                return false;
            } else return true;
        });

        //noinspection unchecked
        return (T) result[0];
    }
}

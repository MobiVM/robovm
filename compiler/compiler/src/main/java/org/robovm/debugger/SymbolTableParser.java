package org.robovm.debugger;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor;

public class SymbolTableParser {

	public static Map<String, Long> readSymbolTable(String executable) throws IOException {
		HashMap<String, Long> symbolTable = new HashMap<>();
		
		Executor exec = new Executor(Logger.NULL_LOGGER, "nm");
		exec.args(executable);
		
		String nmOutput = exec.execCapture();
		String[] nmLines = nmOutput.split("\n");
		
		for (String line : nmLines) {
			String[] parts = line.split(" ");
			if (parts.length > 2 && !parts[0].equals("")) {
				symbolTable.put(parts[2], Long.parseLong(parts[0], 16));
			}
		}
		
		return symbolTable;
	}
}
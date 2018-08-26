/*
 * Copyright (C) 2018 Achrouf Abdenour <achroufabdenour@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */

package org.robovm.compiler;

import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.Unreachable;

import soot.SootMethod;

/**
 * @author Achrouf Abdenour 
 * In whole program mode .If a method is not reachable
 * we create only a small method rather generating the whole/real body
 * of the soot method.Later this weakly linked method will be replaced
 * by an alias function in the link phase pointing to the
 * "strippedMethod" function.
 */

public class StrippedMethodCompiler extends AbstractMethodCompiler {

    private Function function;

    public StrippedMethodCompiler(Config config) {
        super(config);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Function doCompile(ModuleBuilder moduleBuilder, SootMethod method) {
        // TODO Auto-generated method stub
        function = createMethodFunction(method);
        function.add(new Unreachable());
        moduleBuilder.addFunction(function);
        return function;
    }

}

/*
 * Copyright (C) 2025 The MobiVM Contributors
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
package org.robovm.compiler.target.ios.simulator;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SimCtl {


    /**
     * @return fresh copy -- to receive fresh device state (and paired state)
     */
    public static DeviceType refresh(DeviceType orig) {
        String udid = orig.getUdid();
        for (DeviceType t : list()) {
            if (udid.equals(t.getUdid()))
                return t;
        }

        return null;
    }

    public static List<DeviceType> list() {
        try {
            String capture = new Executor(Logger.NULL_LOGGER, "xcrun").args(
                    "simctl", "list", "devices", "pairs", "-j").execCapture();

            JsonObject root = (JsonObject) Jsoner.deserialize(capture);
            return SimCtlParsers.parseListResponse(root);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void boot(Logger log, String udid) throws IOException {
        Executor executor = new Executor(log, "xcrun");
        executor.args("simctl", "boot", udid);
        executor.exec();
    }

    public static void show(Logger log, String udid) throws IOException {
        Executor executor = new Executor(log, "open");
        executor.args("-a", "Simulator", "--args", "-CurrentDeviceUDID", udid);
        executor.exec();
    }

    public static void install(Logger log, String udid, String localPath) throws IOException {
        Executor executor = new Executor(log, "xcrun");
        executor.args("simctl", "install", udid, localPath);
        executor.exec();
    }

    public static Process launchAsync(
            Logger log, String udid, String bundleId,
            List<String> arguments,
            Map<String, String> env,
            OutputStream outStream,
            OutputStream errStream
    ) throws IOException {
        Executor executor = new Executor(log, "xcrun");
        List<Object> args = new ArrayList<>();
        args.add("simctl");
        args.add("launch");
        args.add("--console");
        args.add(udid);
        args.add(bundleId);
        args.addAll(arguments);
        executor.args(args);
        if (env != null && !env.isEmpty()) {
            Map<String, String> simEnv = new HashMap<>();
            for (Map.Entry<String, String> entry : env.entrySet()) {
                simEnv.put("SIMCTL_CHILD_" + entry.getKey(), entry.getValue());
            }
            executor.env(simEnv);
        }
        executor.out(outStream).err(errStream).closeOutputStreams(true).inheritEnv(false);
        return executor.execAsync();
    }
}

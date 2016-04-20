/*
 * Copyright (C) 2015 RoboVM AB
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
package org.robovm.eclipse.internal.ib;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

import org.robovm.compiler.config.Config.Home;
import org.robovm.compiler.log.Logger;

/**
 * 
 */
public class IBIntegratorProxy {
    private static Class<?> ibintegratorClass;
    private final Object instance;

    static Class<?> getIBIntegratorClass() {
        if (ibintegratorClass == null) {
            try {
                ibintegratorClass = Class.forName("com.robovm.ibintegrator.IBIntegrator");
            } catch (ClassNotFoundException e) {
                throw new Error("The RoboVM Interface Builder integrator has not "
                        + "been compiled into this version of the RoboVM for Eclipse plugin");
            }
        }
        return ibintegratorClass;
    }

    public IBIntegratorProxy(Home home, Logger logger, String projectName, File target) {
        try {
            try {
                instance = getIBIntegratorClass().getConstructor(Home.class, Logger.class, String.class, File.class)
                        .newInstance(home, logger, projectName, target);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void setInfoPlist(final File file) {
        try {
            try {
                getIBIntegratorClass().getMethod("setInfoPlist", File.class).invoke(instance, file);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void setResourceFolders(Set<File> resourceFolders) {
        try {
            try {
                getIBIntegratorClass().getMethod("setResourceFolders", Set.class).invoke(instance, resourceFolders);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void setClasspath(List<File> classpath) {
        try {
            try {
                getIBIntegratorClass().getMethod("setClasspath", List.class).invoke(instance, classpath);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void setSourceFolders(Set<File> sourceFolders) {
        try {
            try {
                getIBIntegratorClass().getMethod("setSourceFolders", Set.class).invoke(instance, sourceFolders);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public File newIOSStoryboard(String name, File path) {
        try {
            try {
                return (File) getIBIntegratorClass().getMethod("newIOSStoryboard", String.class, File.class)
                        .invoke(instance, name, path);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public File newIOSView(String name, File path) {
        try {
            try {
                return (File) getIBIntegratorClass().getMethod("newIOSView", String.class, File.class)
                        .invoke(instance, name, path);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public File newIOSViewController(String name, File path) {
        try {
            try {
                return (File) getIBIntegratorClass().getMethod("newIOSViewController", String.class, File.class)
                        .invoke(instance, name, path);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void openProject() {
        try {
            try {
                getIBIntegratorClass().getMethod("openProject").invoke(instance);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void openProjectFile(String file) {
        try {
            try {
                getIBIntegratorClass().getMethod("openProjectFile", String.class)
                        .invoke(instance, file);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void start() {
        try {
            try {
                getIBIntegratorClass().getMethod("start").invoke(instance);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    public void shutDown() {
        try {
            try {
                getIBIntegratorClass().getMethod("shutDown").invoke(instance);
            } catch (InvocationTargetException e) {
                throw e.getCause() != null ? e.getCause() : e;
            }
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new Error(t);
        }
    }
}

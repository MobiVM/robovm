/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.ibxcode.parser;

import org.robovm.ibxcode.IBException;
import org.robovm.ibxcode.Utils;
import org.robovm.ibxcode.consts.AnnotationsTypes;
import org.robovm.ibxcode.consts.ClassNames;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.Type;
import org.robovm.ibxcode.export.IBActionExportMemberItem;
import org.robovm.ibxcode.export.IBClassExportData;
import org.robovm.ibxcode.export.IBOutletCollectionExportMemberItem;
import org.robovm.ibxcode.export.IBOutletExportMemberItem;
import org.robovm.ibxcode.export.IClassExportMemberItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Parses JavaClass to fetch IBOutlet/IBOutletCollection/IBAction structures
 */
public class IBClassMemberParser {
    private Map<String, IBClassHierarchyData> resolvedClasses;

    public IBClassMemberParser(Map<String, IBClassHierarchyData> resolvedClasses) {
        this.resolvedClasses = resolvedClasses;
    }

    public List<IBClassExportData> parse() {
        List<IBClassExportData> exportClasses = new ArrayList<>();

        for (IBClassHierarchyData classData : this.resolvedClasses.values()) {
            // skip native and not inherited from UIKit
            if (classData.hasFlags(IBClassHierarchyData.FLAG_NATIVE_CLASS))
                continue;
            if (!classData.hasFlags(IBClassHierarchyData.FLAG_INHERITS_UIKIT))
                continue;

            List<IClassExportMemberItem> members = null;

            // create property for fields
            for (Field field : classData.jc.getFields()) {
                IClassExportMemberItem exportMemberItem = null;
                for (AnnotationEntry entry : field.getAnnotationEntries()) {
                    switch (entry.getAnnotationType()) {
                        case AnnotationsTypes.IBOUTLET:
                            exportMemberItem = createIBOutletItem(classData, field, entry, "IBOutlet");
                            break;
                        case AnnotationsTypes.IBINSPECTABLE:
                            exportMemberItem = createIBOutletItem(classData, field, entry, "IBInspectable");
                            break;
                        case AnnotationsTypes.IBOUTLETCOLLECTION:
                            exportMemberItem = createIBOutletCollectionItem(classData, field, entry);
                            break;
                    }

                    if (exportMemberItem != null) {
                        if (members == null)
                            members = new ArrayList<>();
                        members.add(exportMemberItem);
                        break;
                    }
                }
            }

            // create IBAction references from members
            for (Method method : classData.jc.getMethods()) {
                if (method.isStatic())
                    continue;
                IClassExportMemberItem exportMemberItem = null;
                for (AnnotationEntry entry : method.getAnnotationEntries()) {
                    switch (entry.getAnnotationType()) {
                        case AnnotationsTypes.IBOUTLET:
                            exportMemberItem = createIBOutletItem(classData, method, entry, "IBOutlet");
                            break;
                        case AnnotationsTypes.IBINSPECTABLE:
                            exportMemberItem = createIBOutletItem(classData, method, entry, "IBInspectable");
                            break;
                        case AnnotationsTypes.IBOUTLETCOLLECTION:
                            exportMemberItem = createIBOutletCollectionItem(classData, method, entry);
                            break;
                        case AnnotationsTypes.IBACTION:
                            exportMemberItem = createIBActionItem(classData, method, entry);
                            break;
                    }

                    if (exportMemberItem != null) {
                        if (members == null)
                            members = new ArrayList<>();
                        members.add(exportMemberItem);
                        break;
                    }
                }
            }

            //
            exportClasses.add(new IBClassExportData(classData, members));
        }

        return exportClasses;
    }


    private IClassExportMemberItem createIBOutletItem(IBClassHierarchyData classData, Method method,
                                                      AnnotationEntry entry, String propertyType) {
        // validate
        IBClassHierarchyData fieldType = null;
        String exceptionMessage = null;
        Type[] argTypes = method.getArgumentTypes();
        if (method.isAbstract() || method.isStatic()) {
            exceptionMessage = propertyType + ": setter shall not be abstract or static: while handling " + method.getName() + "@" +
                    classData.jc.getClassName();
        } else if (method.getReturnType() != Type.VOID &&  argTypes.length != 1) {
            exceptionMessage = propertyType + ": setter shall take 1 arg and return VOID: while handling " + method.getName() + "@" +
                    classData.jc.getClassName();
        } else {
            // check if argument is know
            String fieldTypeStr = argTypes[0].toString();
            fieldType = this.resolvedClasses.get(fieldTypeStr);
            if (fieldType == null)
                fieldType = Utils.convertKnownClasses(fieldTypeStr, this.resolvedClasses);
            if (fieldType == null || fieldType.isUnresolved()) {
                exceptionMessage = propertyType + ": unresolved type " + fieldTypeStr + ": while handling " + method.getName() + "@" +
                        classData.jc.getClassName();
            } else if (!fieldType.isNative() && !fieldType.isUIKit() && !fieldType.isPrimitive() && !fieldType.isUIKitStruct()) {
                exceptionMessage = propertyType + ": wrong type " + fieldTypeStr + " (NativeClass or UIKit subclasses expected): while handling " +
                        method.getName() + "@" + classData.jc.getClassName();
            }
            // all ok :)
        }

        if (exceptionMessage != null)
            throw new IBException(exceptionMessage);

        return createIBOutletItem(propertyType, fieldType, entry, Utils.getFieldName(method.getName()));
    }


    private IClassExportMemberItem createIBOutletItem(IBClassHierarchyData classData, Field field,
                                                      AnnotationEntry entry, String propertyType) {
        // validate
        IBClassHierarchyData fieldType = null;
        String exceptionMessage = null;
        if (field.isFinal() || field.isStatic()) {
            exceptionMessage = propertyType + ": field shall not be final or static: while handling " + field.getName() + "@" +
                    classData.jc.getClassName();
        } else {
            // check if argument is know
            String fieldTypeStr = field.getType().toString();
            fieldType = this.resolvedClasses.get(fieldTypeStr);
            if (fieldType == null)
                fieldType = Utils.convertKnownClasses(fieldTypeStr, this.resolvedClasses);
            if (fieldType == null || fieldType.isUnresolved()) {
                exceptionMessage = propertyType + ": unresolved type " + fieldTypeStr + ": while handling " + field.getName() + "@" +
                        classData.jc.getClassName();
            } else if (!fieldType.isNative() && !fieldType.isUIKit() && !fieldType.isPrimitive() && !fieldType.isUIKitStruct()) {
                exceptionMessage = propertyType + ": wrong type " + fieldTypeStr + " (NativeClass or UIKit subclasses expected): while handling " +
                        field.getName() + "@" + classData.jc.getClassName();
            }
            // all ok :)
        }

        if (exceptionMessage != null)
            throw new IBException(exceptionMessage);

        return createIBOutletItem(propertyType, fieldType, entry, field.getName());
    }


    private IClassExportMemberItem createIBOutletItem(String propertyType, IBClassHierarchyData fieldType,
                                                      AnnotationEntry entry, String name) {
        // check annotation for custom name and selector
        String selector = Utils.getAnnotationValue(entry, "selector", null);
        name = Utils.getAnnotationValue(entry, "name", name);
        return new IBOutletExportMemberItem(propertyType, name, selector, fieldType);
    }


    private IClassExportMemberItem createIBOutletCollectionItem(IBClassHierarchyData classData, Method method, AnnotationEntry entry) {
        // validate
        IBClassHierarchyData fieldType = null;
        String exceptionMessage = null;
        Type[] argTypes = method.getArgumentTypes();
        if (method.isAbstract() || method.isStatic()) {
            exceptionMessage = "IBOutletCollection: setter shall not be abstract or static: while handling " +
                    method.getName() + "@" + classData.jc.getClassName();
        } else if (method.getReturnType() != Type.VOID &&  argTypes.length != 1) {
            exceptionMessage = "IBOutletCollection: setter shall take 1 arg and return VOID: while handling " +
                    method.getName() + "@" + classData.jc.getClassName();
        } else {
            // check if argument type is know
            String fieldTypeSig = method.getGenericSignature();
            if (!fieldTypeSig.startsWith("(" + ClassNames.NSArraySig + "<L")) {
                // NSArray expected
                exceptionMessage = "IBOutletCollection: wrong type " + method.getArgumentTypes()[0] + ", NSArray expected: while handling " +
                        method.getName() + "@" + classData.jc.getClassName();
            } else {
                // get generic type from generic signature
                // signature example (Lorg/robovm/apple/foundation/NSArray<Lorg/robovm/apple/uikit/UIView;>;)V
                String fieldTypeStr = fieldTypeSig.replace("(" + ClassNames.NSArraySig + "<L", "")
                        .replace(";>;)V", "")
                        .replace('/', '.');
                fieldType = this.resolvedClasses.get(fieldTypeStr);
                if (fieldType == null || fieldType.isUnresolved()) {
                    exceptionMessage = "IBOutletCollection: unresolved generic type " + fieldTypeStr + ": while handling " + method.getName() + "@" +
                            classData.jc.getClassName();
                } else if (!fieldType.isNative() && !fieldType.isUIKit()) {
                    exceptionMessage = "IBOutletCollection: wrong generic type " + fieldTypeStr + " (NativeClass or UIKit subclasses expected): while handling " +
                            method.getName() + "@" + classData.jc.getClassName();
                }
            }
            // all ok :)
        }

        if (exceptionMessage != null)
            throw new IBException(exceptionMessage);

        return createIBOutletCollectionItem(fieldType, entry, Utils.getFieldName(method.getName()));
    }


    private IClassExportMemberItem createIBOutletCollectionItem(IBClassHierarchyData classData, Field field, AnnotationEntry entry) {
        // validate
        IBClassHierarchyData fieldType = null;
        String exceptionMessage = null;
        if (field.isFinal() || field.isStatic()) {
            exceptionMessage = "IBOutletCollection: field shall not be final or static: while handling " + field.getName() + "@" +
                    classData.jc.getClassName();
        } else {
            // Ljava/util/List<Lcom/bwinparty/poker/table/ui/minitable/MiniTableState;>;
            // check if argument type is know
            String fieldTypeSig = field.getGenericSignature();
            if (!fieldTypeSig.startsWith(ClassNames.NSArraySig + "<L")) {
                // NSArray expected
                exceptionMessage = "wrong IBOutletCollection type " + field.getType() + ", NSArray expected: while handling " +
                        field.getName() + "@" + classData.jc.getClassName();
            } else {
                // get generic type from generic signature
                String fieldTypeStr = fieldTypeSig.replace(ClassNames.NSArraySig + "<L", "")
                        .replace(";>;", "")
                        .replace('/', '.');
                fieldType = this.resolvedClasses.get(fieldTypeStr);
                if (fieldType == null || fieldType.isUnresolved()) {
                    exceptionMessage = "IBOutletCollection: unresolved type " + fieldTypeStr + ": while handling " + field.getName() + "@" +
                            classData.jc.getClassName();
                } else if (!fieldType.isNative() && !fieldType.isUIKit()) {
                    exceptionMessage = "IBOutletCollection: wrong type " + fieldTypeStr + " (NativeClass or UIKit subclasses expected): while handling " +
                            field.getName() + "@" + classData.jc.getClassName();
                }
            }
            // all ok :)
        }

        if (exceptionMessage != null)
            throw new IBException(exceptionMessage);

        return createIBOutletCollectionItem(fieldType, entry, field.getName());
    }


    private IClassExportMemberItem createIBOutletCollectionItem(IBClassHierarchyData fieldType, AnnotationEntry entry, String name) {
        // check annotation for custom name and selector
        String selector = Utils.getAnnotationValue(entry, "selector", null);
        name = Utils.getAnnotationValue(entry, "name", name);
        return new IBOutletCollectionExportMemberItem(name, selector, fieldType);
    }


    private IClassExportMemberItem createIBActionItem(IBClassHierarchyData classData, Method method, AnnotationEntry entry) {
        // validate
        IBClassHierarchyData fieldType = null;
        String exceptionMessage = null;
        Type[] argTypes = method.getArgumentTypes();
        if (method.isAbstract() || method.isStatic()) {
            exceptionMessage = "IBAction: shall not be abstract or static: while handling " +
                    method.getName() + "@" + classData.jc.getClassName();
        } else if (method.getReturnType() != Type.VOID &&  argTypes.length >  1) {
            exceptionMessage = "IBAction: setter shall take 0 or 1 arg and return VOID: while handling " +
                    method.getName() + "@" + classData.jc.getClassName();
        } else {
            // check if argument type is know
            if (argTypes.length == 1) {
                String fieldTypeStr = argTypes[0].toString();
                fieldType = this.resolvedClasses.get(fieldTypeStr);
                if (fieldType == null || fieldType.isUnresolved()) {
                    exceptionMessage = "IBAction: unresolved type " + fieldTypeStr + ": while handling " + method.getName() + "@" +
                            classData.jc.getClassName();
                } else if (!fieldType.isNative() && !fieldType.isUIKit()) {
                    exceptionMessage = "IBAction: arg type " + fieldTypeStr + " (NativeClass or UIKit subclasses expected): while handling " +
                            method.getName() + "@" + classData.jc.getClassName();
                }
            }
            // all ok :)
        }

        if (exceptionMessage != null)
            throw new IBException(exceptionMessage);

        // get selector name
        String selector = Utils.getAnnotationValue(entry, "selector", null);
        if (selector != null && selector.endsWith(":")) {
            // TODO: there should be sanity as selector could differ in arg number with method
            selector = selector.substring(0, selector.length() - 1);
        }

        return new IBActionExportMemberItem(method.getName(), selector, fieldType);
    }
}

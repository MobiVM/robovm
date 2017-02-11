
#ifdef GET_GROUPS
#endif // GET_GROUPS


#ifdef GET_PACKAGES
PACKAGE("alpha", -1, false)
PACKAGE("alpha.core", -1, true)
PACKAGE("alpha.cplusplus", -1, true)
PACKAGE("alpha.deadcode", -1, true)
PACKAGE("alpha.osx", -1, true)
PACKAGE("alpha.osx.cocoa", -1, true)
PACKAGE("alpha.osx.cocoa.localizability", -1, true)
PACKAGE("alpha.security", -1, true)
PACKAGE("alpha.security.taint", -1, true)
PACKAGE("alpha.unix", -1, true)
PACKAGE("alpha.unix.cstring", -1, true)
PACKAGE("core", -1, false)
PACKAGE("core.builtin", -1, false)
PACKAGE("core.uninitialized", -1, false)
PACKAGE("cplusplus", -1, false)
PACKAGE("deadcode", -1, false)
PACKAGE("debug", -1, false)
PACKAGE("llvm", -1, false)
PACKAGE("nullability", -1, false)
PACKAGE("optin", -1, false)
PACKAGE("optin.mpi", -1, false)
PACKAGE("optin.osx", -1, false)
PACKAGE("optin.osx.cocoa", -1, false)
PACKAGE("optin.osx.cocoa.localizability", -1, false)
PACKAGE("optin.performance", -1, false)
PACKAGE("osx", -1, false)
PACKAGE("osx.cocoa", -1, false)
PACKAGE("osx.coreFoundation", -1, false)
PACKAGE("osx.coreFoundation.containers", -1, false)
PACKAGE("security", -1, false)
PACKAGE("security.insecureAPI", -1, false)
PACKAGE("unix", -1, false)
PACKAGE("unix.cstring", -1, true)
#endif // GET_PACKAGES


#ifdef GET_CHECKERS
CHECKER("debug.Stats", AnalyzerStatsChecker, AnalyzerStatsChecker.cpp, "Emit warnings with analyzer statistics", -1, false)
CHECKER("alpha.security.ArrayBound", ArrayBoundChecker, ArrayBoundChecker.cpp, "Warn about buffer overflows (older checker)", -1, true)
CHECKER("alpha.security.ArrayBoundV2", ArrayBoundCheckerV2, ArrayBoundCheckerV2.cpp, "Warn about buffer overflows (newer checker)", -1, true)
CHECKER("alpha.core.BoolAssignment", BoolAssignmentChecker, BoolAssignmentChecker.cpp, "Warn about assigning non-{0,1} values to Boolean variables", -1, true)
CHECKER("debug.DumpBugHash", BugHashDumper, DebugCheckers.cpp, "Dump the bug hash for all statements.", -1, false)
CHECKER("core.builtin.BuiltinFunctions", BuiltinFunctionChecker, BuiltinFunctionChecker.cpp, "Evaluate compiler builtin functions (e.g., alloca())", -1, false)
CHECKER("osx.coreFoundation.CFError", CFErrorChecker, NSErrorChecker.cpp, "Check usage of CFErrorRef* parameters", -1, false)
CHECKER("debug.DumpCFG", CFGDumper, DebugCheckers.cpp, "Display Control-Flow Graphs", -1, false)
CHECKER("debug.ViewCFG", CFGViewer, DebugCheckers.cpp, "View Control-Flow Graphs using GraphViz", -1, false)
CHECKER("osx.coreFoundation.CFNumber", CFNumberCreateChecker, BasicObjCFoundationChecks.cpp, "Check for proper uses of CFNumberCreate", -1, false)
CHECKER("osx.coreFoundation.CFRetainRelease", CFRetainReleaseChecker, BasicObjCFoundationChecks.cpp, "Check for null arguments to CFRetain/CFRelease/CFMakeCollectable", -1, false)
CHECKER("alpha.unix.cstring.BufferOverlap", CStringBufferOverlap, CStringChecker.cpp, "Checks for overlap in two buffer arguments", -1, true)
CHECKER("alpha.unix.cstring.NotNullTerminated", CStringNotNullTerm, CStringChecker.cpp, "Check for arguments which are not null-terminating strings", -1, true)
CHECKER("unix.cstring.NullArg", CStringNullArg, CStringChecker.cpp, "Check for null pointers being passed as arguments to C string functions", -1, true)
CHECKER("alpha.unix.cstring.OutOfBounds", CStringOutOfBounds, CStringChecker.cpp, "Check for out-of-bounds access in string functions", -1, true)
CHECKER("unix.cstring.BadSizeArg", CStringSyntaxChecker, CStringSyntaxChecker.cpp, "Check the size argument passed into C string functions for common erroneous patterns", -1, true)
CHECKER("core.CallAndMessage", CallAndMessageChecker, CallAndMessageChecker.cpp, "Check for logical errors for function calls and Objective-C message expressions (e.g., uninitialized arguments, null function pointers)", -1, false)
CHECKER("alpha.core.CallAndMessageUnInitRefArg", CallAndMessageUnInitRefArg, CallAndMessageChecker.cpp, "Check for logical errors for function calls and Objective-C message expressions (e.g., uninitialized arguments, null function pointers, and pointer to undefined variables)", -1, true)
CHECKER("debug.DumpCalls", CallDumper, TraversalChecker.cpp, "Print calls as they are traversed by the engine", -1, false)
CHECKER("debug.DumpCallGraph", CallGraphDumper, DebugCheckers.cpp, "Display Call Graph", -1, false)
CHECKER("debug.ViewCallGraph", CallGraphViewer, DebugCheckers.cpp, "View Call Graph using GraphViz", -1, false)
CHECKER("alpha.core.CastSize", CastSizeChecker, CastSizeChecker.cpp, "Check when casting a malloc'ed type T, whether the size is a multiple of the size of T", -1, true)
CHECKER("alpha.core.CastToStruct", CastToStructChecker, CastToStructChecker.cpp, "Check for cast from non-struct pointer to struct pointer", -1, true)
CHECKER("alpha.unix.Chroot", ChrootChecker, ChrootChecker.cpp, "Check improper use of chroot", -1, true)
CHECKER("osx.cocoa.ClassRelease", ClassReleaseChecker, BasicObjCFoundationChecks.cpp, "Check for sending 'retain', 'release', or 'autorelease' directly to a Class", -1, false)
CHECKER("debug.ConfigDumper", ConfigDumper, DebugCheckers.cpp, "Dump config table", -1, false)
CHECKER("deadcode.DeadStores", DeadStoresChecker, DeadStoresChecker.cpp, "Check for values stored to variables that are never read afterwards", -1, false)
CHECKER("core.NullDereference", DereferenceChecker, DereferenceChecker.cpp, "Check for dereferences of null pointers", -1, false)
CHECKER("alpha.osx.cocoa.DirectIvarAssignment", DirectIvarAssignment, DirectIvarAssignment.cpp, "Check for direct assignments to instance variables", -1, true)
CHECKER("alpha.osx.cocoa.DirectIvarAssignmentForAnnotatedFunctions", DirectIvarAssignmentForAnnotatedFunctions, DirectIvarAssignment.cpp, "Check for direct assignments to instance variables in the methods annotated with objc_no_direct_instance_variable_assignment", -1, true)
CHECKER("core.DivideZero", DivZeroChecker, DivZeroChecker.cpp, "Check for division by zero", -1, false)
CHECKER("debug.DumpDominators", DominatorsTreeDumper, DebugCheckers.cpp, "Print the dominance tree for a given CFG", -1, false)
CHECKER("alpha.core.DynamicTypeChecker", DynamicTypeChecker, DynamicTypeChecker.cpp, "Check for cases where the dynamic and the static type of an object are unrelated.", -1, true)
CHECKER("core.DynamicTypePropagation", DynamicTypePropagation, DynamicTypePropagation.cpp, "Generate dynamic type information", -1, false)
CHECKER("optin.osx.cocoa.localizability.EmptyLocalizationContextChecker", EmptyLocalizationContextChecker, LocalizationChecker.cpp, "Check that NSLocalizedString macros include a comment for context", -1, false)
CHECKER("debug.ViewExplodedGraph", ExplodedGraphViewer, DebugCheckers.cpp, "View Exploded Graphs using GraphViz", -1, false)
CHECKER("debug.ExprInspection", ExprInspectionChecker, ExprInspectionChecker.cpp, "Check the analyzer's understanding of expressions", -1, false)
CHECKER("alpha.core.FixedAddr", FixedAddressChecker, FixedAddressChecker.cpp, "Check for assignment of a fixed address to a pointer", -1, true)
CHECKER("security.FloatLoopCounter", FloatLoopCounter, CheckSecuritySyntaxOnly.cpp, "Warn on using a floating point value as a loop counter (CERT: FLP30-C, FLP30-CPP)", -1, false)
CHECKER("alpha.security.taint.TaintPropagation", GenericTaintChecker, GenericTaintChecker.cpp, "Generate taint information used by other checkers", -1, true)
CHECKER("alpha.core.IdenticalExpr", IdenticalExprChecker, IdenticalExprChecker.cpp, "Warn about unintended use of identical expressions in operators", -1, true)
CHECKER("alpha.osx.cocoa.InstanceVariableInvalidation", InstanceVariableInvalidation, IvarInvalidationChecker.cpp, "Check that the invalidatable instance variables are invalidated in the methods annotated with objc_instance_variable_invalidator", -1, true)
CHECKER("llvm.Conventions", LLVMConventionsChecker, LLVMConventionsChecker.cpp, "Check code for LLVM codebase conventions", -1, false)
CHECKER("debug.DumpLiveVars", LiveVariablesDumper, DebugCheckers.cpp, "Print results of live variable analysis", -1, false)
CHECKER("optin.mpi.MPI-Checker", MPIChecker, MPIChecker.cpp, "Checks MPI code", -1, false)
CHECKER("osx.SecKeychainAPI", MacOSKeychainAPIChecker, MacOSKeychainAPIChecker.cpp, "Check for proper uses of Secure Keychain APIs", -1, false)
CHECKER("osx.API", MacOSXAPIChecker, MacOSXAPIChecker.cpp, "Check for proper uses of various Apple APIs", -1, false)
CHECKER("unix.Malloc", MallocChecker, MallocChecker.cpp, "Check for memory leaks, double free, and use-after-free problems. Traces memory managed by malloc()/free().", -1, false)
CHECKER("alpha.security.MallocOverflow", MallocOverflowSecurityChecker, MallocOverflowSecurityChecker.cpp, "Check for overflows in the arguments to malloc()", -1, true)
CHECKER("unix.MallocSizeof", MallocSizeofChecker, MallocSizeofChecker.cpp, "Check for dubious malloc arguments involving sizeof", -1, false)
CHECKER("unix.MismatchedDeallocator", MismatchedDeallocatorChecker, MallocChecker.cpp, "Check for mismatched deallocators.", -1, false)
CHECKER("alpha.osx.cocoa.MissingInvalidationMethod", MissingInvalidationMethod, IvarInvalidationChecker.cpp, "Check that the invalidation methods are present in classes that contain invalidatable instance variables", -1, true)
CHECKER("osx.cocoa.NSAutoreleasePool", NSAutoreleasePoolChecker, NSAutoreleasePoolChecker.cpp, "Warn for suboptimal uses of NSAutoreleasePool in Objective-C GC mode", -1, false)
CHECKER("osx.cocoa.NSError", NSErrorChecker, NSErrorChecker.cpp, "Check usage of NSError** parameters", -1, false)
CHECKER("cplusplus.NewDelete", NewDeleteChecker, MallocChecker.cpp, "Check for double-free and use-after-free problems. Traces memory managed by new/delete.", -1, false)
CHECKER("cplusplus.NewDeleteLeaks", NewDeleteLeaksChecker, MallocChecker.cpp, "Check for memory leaks. Traces memory managed by new/delete.", -1, false)
CHECKER("osx.cocoa.NilArg", NilArgChecker, BasicObjCFoundationChecks.cpp, "Check for prohibited nil arguments to ObjC method calls", -1, false)
CHECKER("core.builtin.NoReturnFunctions", NoReturnFunctionChecker, NoReturnFunctionChecker.cpp, "Evaluate \"panic\" functions that are known to not return to the caller", -1, false)
CHECKER("optin.osx.cocoa.localizability.NonLocalizedStringChecker", NonLocalizedStringChecker, LocalizationChecker.cpp, "Warns about uses of non-localized NSStrings passed to UI methods expecting localized NSStrings", -1, false)
CHECKER("core.NonNullParamChecker", NonNullParamChecker, NonNullParamChecker.cpp, "Check for null pointers passed as arguments to a function whose arguments are references or marked with the 'nonnull' attribute", -1, false)
CHECKER("nullability.NullPassedToNonnull", NullPassedToNonnullChecker, NullabilityChecker.cpp, "Warns when a null pointer is passed to a pointer which has a _Nonnull type.", -1, false)
CHECKER("nullability.NullReturnedFromNonnull", NullReturnedFromNonnullChecker, NullabilityChecker.cpp, "Warns when a null pointer is returned from a function that has _Nonnull return type.", -1, false)
CHECKER("nullability.NullableDereferenced", NullableDereferencedChecker, NullabilityChecker.cpp, "Warns when a nullable pointer is dereferenced.", -1, false)
CHECKER("nullability.NullablePassedToNonnull", NullablePassedToNonnullChecker, NullabilityChecker.cpp, "Warns when a nullable pointer is passed to a pointer which has a _Nonnull type.", -1, false)
CHECKER("nullability.NullablePassedToNonnull", NullableReturnedFromNonnullChecker, NullabilityChecker.cpp, "Warns when a nullable pointer is returned from a function that has _Nonnull return type.", -1, false)
CHECKER("osx.cocoa.AtSync", ObjCAtSyncChecker, ObjCAtSyncChecker.cpp, "Check for nil pointers used as mutexes for @synchronized", -1, false)
CHECKER("osx.coreFoundation.containers.PointerSizedValues", ObjCContainersASTChecker, ObjCContainersASTChecker.cpp, "Warns if 'CFArray', 'CFDictionary', 'CFSet' are created with non-pointer-size values", -1, false)
CHECKER("osx.coreFoundation.containers.OutOfBounds", ObjCContainersChecker, ObjCContainersChecker.cpp, "Checks for index out-of-bounds when using 'CFArray' API", -1, false)
CHECKER("osx.cocoa.Dealloc", ObjCDeallocChecker, CheckObjCDealloc.cpp, "Warn about Objective-C classes that lack a correct implementation of -dealloc", -1, false)
CHECKER("osx.cocoa.ObjCGenerics", ObjCGenericsChecker, DynamicTypePropagation.cpp, "Check for type errors when using Objective-C generics", -1, false)
CHECKER("osx.cocoa.Loops", ObjCLoopChecker, BasicObjCFoundationChecks.cpp, "Improved modeling of loops using Cocoa collection types", -1, false)
CHECKER("osx.cocoa.IncompatibleMethodTypes", ObjCMethSigsChecker, CheckObjCInstMethSignature.cpp, "Warn about Objective-C method signatures with type incompatibilities", -1, false)
CHECKER("osx.cocoa.NonNilReturnValue", ObjCNonNilReturnValueChecker, BasicObjCFoundationChecks.cpp, "Model the APIs that are guaranteed to return a non-nil value", -1, false)
CHECKER("osx.cocoa.SelfInit", ObjCSelfInitChecker, ObjCSelfInitChecker.cpp, "Check that 'self' is properly initialized inside an initializer method", -1, false)
CHECKER("osx.cocoa.MissingSuperCall", ObjCSuperCallChecker, ObjCMissingSuperCallChecker.cpp, "Warn about Objective-C methods that lack a necessary call to super", -1, false)
CHECKER("osx.cocoa.SuperDealloc", ObjCSuperDeallocChecker, ObjCSuperDeallocChecker.cpp, "Warn about improper use of '[super dealloc]' in Objective-C", -1, false)
CHECKER("osx.cocoa.UnusedIvars", ObjCUnusedIvarsChecker, ObjCUnusedIVarsChecker.cpp, "Warn about private ivars that are never used", -1, false)
CHECKER("optin.performance.Padding", PaddingChecker, PaddingChecker.cpp, "Check for excessively padded structs.", -1, false)
CHECKER("alpha.osx.cocoa.localizability.PluralMisuseChecker", PluralMisuseChecker, LocalizationChecker.cpp, "Warns against using one vs. many plural pattern in code when generating localized strings.", -1, true)
CHECKER("alpha.core.PointerArithm", PointerArithChecker, PointerArithChecker, "Check for pointer arithmetic on locations other than array elements", -1, true)
CHECKER("alpha.core.PointerSub", PointerSubChecker, PointerSubChecker, "Check for pointer subtractions on two pointers pointing to different memory chunks", -1, true)
CHECKER("alpha.unix.PthreadLock", PthreadLockChecker, PthreadLockChecker.cpp, "Simple lock -> unlock checker", -1, true)
CHECKER("osx.cocoa.RetainCount", RetainCountChecker, RetainCountChecker.cpp, "Check for leaks and improper reference count management", -1, false)
CHECKER("alpha.security.ReturnPtrRange", ReturnPointerRangeChecker, ReturnPointerRangeChecker.cpp, "Check for an out-of-bound pointer being returned to callers", -1, true)
CHECKER("core.uninitialized.UndefReturn", ReturnUndefChecker, ReturnUndefChecker.cpp, "Check for uninitialized values being returned to the caller", -1, false)
CHECKER("alpha.unix.SimpleStream", SimpleStreamChecker, SimpleStreamChecker.cpp, "Check for misuses of stream APIs", -1, true)
CHECKER("alpha.core.SizeofPtr", SizeofPointerChecker, CheckSizeofPointer.cpp, "Warn about unintended use of sizeof() on pointer expressions", -1, true)
CHECKER("core.StackAddressEscape", StackAddrEscapeChecker, StackAddrEscapeChecker.cpp, "Check that addresses to stack memory do not escape the function", -1, false)
CHECKER("alpha.unix.Stream", StreamChecker, StreamChecker.cpp, "Check stream handling functions", -1, true)
CHECKER("debug.TaintTest", TaintTesterChecker, TaintTesterChecker.cpp, "Mark tainted symbols as such.", -1, false)
CHECKER("alpha.core.TestAfterDivZero", TestAfterDivZeroChecker, TestAfterDivZeroChecker.cpp, "Check for division by variable that is later compared against 0. Either the comparison is useless or there is division by zero.", -1, true)
CHECKER("debug.DumpTraversal", TraversalDumper, TraversalChecker.cpp, "Print branch conditions as they are traversed by the engine", -1, false)
CHECKER("security.insecureAPI.UncheckedReturn", UncheckedReturn, CheckSecuritySyntaxOnly.cpp, "Warn on uses of functions whose return values must be always checked", -1, false)
CHECKER("core.uninitialized.Branch", UndefBranchChecker, UndefBranchChecker.cpp, "Check for uninitialized values used as branch conditions", -1, false)
CHECKER("core.uninitialized.CapturedBlockVariable", UndefCapturedBlockVarChecker, UndefCapturedBlockVarChecker.cpp, "Check for blocks that capture uninitialized values", -1, false)
CHECKER("core.UndefinedBinaryOperatorResult", UndefResultChecker, UndefResultChecker.cpp, "Check for undefined results of binary operators", -1, false)
CHECKER("core.uninitialized.ArraySubscript", UndefinedArraySubscriptChecker, UndefinedArraySubscriptChecker.cpp, "Check for uninitialized values used as array subscripts", -1, false)
CHECKER("core.uninitialized.Assign", UndefinedAssignmentChecker, UndefinedAssignmentChecker.cpp, "Check for assigning uninitialized values", -1, false)
CHECKER("unix.API", UnixAPIChecker, UnixAPIChecker.cpp, "Check calls to various UNIX/Posix functions", -1, false)
CHECKER("alpha.deadcode.UnreachableCode", UnreachableCodeChecker, UnreachableCodeChecker.cpp, "Check unreachable code", -1, true)
CHECKER("core.VLASize", VLASizeChecker, VLASizeChecker.cpp, "Check for declarations of VLA of undefined or zero size", -1, false)
CHECKER("osx.cocoa.VariadicMethodTypes", VariadicMethodTypeChecker, BasicObjCFoundationChecks.cpp, "Check for passing non-Objective-C types to variadic collection initialization methods that expect only Objective-C types", -1, false)
CHECKER("unix.Vfork", VforkChecker, VforkChecker.cpp, "Check for proper usage of vfork", -1, false)
CHECKER("alpha.cplusplus.VirtualCall", VirtualCallChecker, VirtualCallChecker.cpp, "Check virtual function calls during construction or destruction", -1, true)
CHECKER("security.insecureAPI.getpw", getpw, CheckSecuritySyntaxOnly.cpp, "Warn on uses of the 'getpw' function", -1, false)
CHECKER("security.insecureAPI.gets", gets, CheckSecuritySyntaxOnly.cpp, "Warn on uses of the 'gets' function", -1, false)
CHECKER("security.insecureAPI.mkstemp", mkstemp, CheckSecuritySyntaxOnly.cpp, "Warn when 'mkstemp' is passed fewer than 6 X's in the format string", -1, false)
CHECKER("security.insecureAPI.mktemp", mktemp, CheckSecuritySyntaxOnly.cpp, "Warn on uses of the 'mktemp' function", -1, false)
CHECKER("security.insecureAPI.rand", rand, CheckSecuritySyntaxOnly.cpp, "Warn on uses of the 'rand', 'random', and related functions", -1, false)
CHECKER("security.insecureAPI.strcpy", strcpy, CheckSecuritySyntaxOnly.cpp, "Warn on uses of the 'strcpy' and 'strcat' functions", -1, false)
CHECKER("security.insecureAPI.vfork", vfork, CheckSecuritySyntaxOnly.cpp, "Warn on uses of the 'vfork' function", -1, false)
#endif // GET_CHECKERS


#ifdef GET_MEMBER_ARRAYS
static const short SubPackageArray0[] = { 1, 13, 15, 25, 32, 17, -1 };
static const short SubPackageArray1[] = { 2, 4, 5, 8, 7, 9, 10, 11, 3, 12, 6, -1 };
static const short CheckerArray2[] = { 3, -1 };
static const short CheckerArray3[] = { 17, -1 };
static const short CheckerArray4[] = { 21, -1 };
static const short CheckerArray5[] = { 22, -1 };
static const short CheckerArray6[] = { 32, -1 };
static const short CheckerArray7[] = { 37, -1 };
static const short CheckerArray8[] = { 40, -1 };
static const short CheckerArray9[] = { 79, -1 };
static const short CheckerArray10[] = { 80, -1 };
static const short CheckerArray11[] = { 86, -1 };
static const short CheckerArray12[] = { 90, -1 };
static const short SubPackageArray13[] = { 14, -1 };
static const short CheckerArray14[] = { 103, -1 };
static const short SubPackageArray15[] = { 16, -1 };
static const short CheckerArray16[] = { 99, -1 };
static const short SubPackageArray17[] = { 18, -1 };
static const short SubPackageArray18[] = { 23, 21, 22, 19, 20, -1 };
static const short CheckerArray19[] = { 28, -1 };
static const short CheckerArray20[] = { 29, -1 };
static const short CheckerArray21[] = { 41, -1 };
static const short CheckerArray22[] = { 51, -1 };
static const short SubPackageArray23[] = { 24, -1 };
static const short CheckerArray24[] = { 78, -1 };
static const short SubPackageArray25[] = { 30, 26, 27, 29, 28, -1 };
static const short CheckerArray26[] = { 1, -1 };
static const short CheckerArray27[] = { 2, -1 };
static const short CheckerArray28[] = { 48, -1 };
static const short CheckerArray29[] = { 83, -1 };
static const short SubPackageArray30[] = { 31, -1 };
static const short CheckerArray31[] = { 39, -1 };
static const short SubPackageArray32[] = { 37, 33, 34, 36, 35, -1 };
static const short CheckerArray33[] = { 23, -1 };
static const short CheckerArray34[] = { 81, -1 };
static const short CheckerArray35[] = { 85, -1 };
static const short CheckerArray36[] = { 88, -1 };
static const short SubPackageArray37[] = { 40, 38, 39, -1 };
static const short CheckerArray38[] = { 11, -1 };
static const short CheckerArray39[] = { 12, -1 };
static const short CheckerArray40[] = { 14, -1 };
static const short SubPackageArray41[] = { 50, 53, 46, 42, 45, 49, 43, 48, 47, 44, -1 };
static const short CheckerArray42[] = { 16, -1 };
static const short CheckerArray43[] = { 30, -1 };
static const short CheckerArray44[] = { 33, -1 };
static const short CheckerArray45[] = { 59, -1 };
static const short CheckerArray46[] = { 27, -1 };
static const short CheckerArray47[] = { 87, -1 };
static const short CheckerArray48[] = { 95, -1 };
static const short CheckerArray49[] = { 100, -1 };
static const short SubPackageArray50[] = { 52, 51, -1 };
static const short CheckerArray51[] = { 5, -1 };
static const short CheckerArray52[] = { 57, -1 };
static const short SubPackageArray53[] = { 54, 55, 56, 57, 58, -1 };
static const short CheckerArray54[] = { 96, -1 };
static const short CheckerArray55[] = { 97, -1 };
static const short CheckerArray56[] = { 93, -1 };
static const short CheckerArray57[] = { 94, -1 };
static const short CheckerArray58[] = { 84, -1 };
static const short SubPackageArray59[] = { 60, 61, -1 };
static const short CheckerArray60[] = { 54, -1 };
static const short CheckerArray61[] = { 55, -1 };
static const short SubPackageArray62[] = { 63, -1 };
static const short CheckerArray63[] = { 26, -1 };
static const short SubPackageArray64[] = { 70, 71, 76, 67, 77, 68, 65, 72, 69, 74, 75, 73, 78, 66, -1 };
static const short CheckerArray65[] = { 25, -1 };
static const short CheckerArray66[] = { 4, -1 };
static const short CheckerArray67[] = { 7, -1 };
static const short CheckerArray68[] = { 19, -1 };
static const short CheckerArray69[] = { 18, -1 };
static const short CheckerArray70[] = { 31, -1 };
static const short CheckerArray71[] = { 43, -1 };
static const short CheckerArray72[] = { 91, -1 };
static const short CheckerArray73[] = { 36, -1 };
static const short CheckerArray74[] = { 0, -1 };
static const short CheckerArray75[] = { 89, -1 };
static const short CheckerArray76[] = { 8, -1 };
static const short CheckerArray77[] = { 20, -1 };
static const short CheckerArray78[] = { 35, -1 };
static const short SubPackageArray79[] = { 80, -1 };
static const short CheckerArray80[] = { 42, -1 };
static const short SubPackageArray81[] = { 82, 83, 84, 85, 85, -1 };
static const short CheckerArray82[] = { 60, -1 };
static const short CheckerArray83[] = { 61, -1 };
static const short CheckerArray84[] = { 62, -1 };
static const short CheckerArray85[] = { 63, 64, -1 };
static const short SubPackageArray86[] = { 94, 89, 87, -1 };
static const short SubPackageArray87[] = { 88, -1 };
static const short CheckerArray88[] = { 44, -1 };
static const short SubPackageArray89[] = { 90, -1 };
static const short SubPackageArray90[] = { 91, -1 };
static const short SubPackageArray91[] = { 93, 92, -1 };
static const short CheckerArray92[] = { 34, -1 };
static const short CheckerArray93[] = { 58, -1 };
static const short SubPackageArray94[] = { 95, -1 };
static const short CheckerArray95[] = { 77, -1 };
static const short SubPackageArray96[] = { 99, 116, 97, 98, -1 };
static const short CheckerArray97[] = { 46, -1 };
static const short CheckerArray98[] = { 45, -1 };
static const short SubPackageArray99[] = { 100, 108, 101, 115, 106, 103, 114, 112, 104, 109, 105, 107, 111, 110, 102, 113, -1 };
static const short CheckerArray100[] = { 65, -1 };
static const short CheckerArray101[] = { 24, -1 };
static const short CheckerArray102[] = { 68, -1 };
static const short CheckerArray103[] = { 71, -1 };
static const short CheckerArray104[] = { 70, -1 };
static const short CheckerArray105[] = { 74, -1 };
static const short CheckerArray106[] = { 52, -1 };
static const short CheckerArray107[] = { 53, -1 };
static const short CheckerArray108[] = { 56, -1 };
static const short CheckerArray109[] = { 72, -1 };
static const short CheckerArray110[] = { 69, -1 };
static const short CheckerArray111[] = { 82, -1 };
static const short CheckerArray112[] = { 73, -1 };
static const short CheckerArray113[] = { 75, -1 };
static const short CheckerArray114[] = { 76, -1 };
static const short CheckerArray115[] = { 101, -1 };
static const short SubPackageArray116[] = { 120, 118, 119, 117, -1 };
static const short CheckerArray117[] = { 6, -1 };
static const short CheckerArray118[] = { 9, -1 };
static const short CheckerArray119[] = { 10, -1 };
static const short SubPackageArray120[] = { 122, 121, -1 };
static const short CheckerArray121[] = { 67, -1 };
static const short CheckerArray122[] = { 66, -1 };
static const short SubPackageArray123[] = { 125, 124, -1 };
static const short CheckerArray124[] = { 38, -1 };
static const short SubPackageArray125[] = { 128, 127, 130, 129, 131, 132, 133, 126, -1 };
static const short CheckerArray126[] = { 92, -1 };
static const short CheckerArray127[] = { 104, -1 };
static const short CheckerArray128[] = { 105, -1 };
static const short CheckerArray129[] = { 106, -1 };
static const short CheckerArray130[] = { 107, -1 };
static const short CheckerArray131[] = { 108, -1 };
static const short CheckerArray132[] = { 109, -1 };
static const short CheckerArray133[] = { 110, -1 };
static const short SubPackageArray134[] = { 140, 135, 136, 137, 138, 139, -1 };
static const short CheckerArray135[] = { 98, -1 };
static const short CheckerArray136[] = { 47, -1 };
static const short CheckerArray137[] = { 49, -1 };
static const short CheckerArray138[] = { 50, -1 };
static const short CheckerArray139[] = { 102, -1 };
static const short SubPackageArray140[] = { 142, 141, -1 };
static const short CheckerArray141[] = { 15, -1 };
static const short CheckerArray142[] = { 13, -1 };
#endif // GET_MEMBER_ARRAYS


#ifdef GET_CHECKNAME_TABLE
  { "alpha",                                                          0, SubPackageArray0, false },
  { "alpha.core",                                                     0, SubPackageArray1, true },
  { "alpha.core.BoolAssignment",                                      CheckerArray2, 0, false },
  { "alpha.core.CallAndMessageUnInitRefArg",                          CheckerArray3, 0, false },
  { "alpha.core.CastSize",                                            CheckerArray4, 0, false },
  { "alpha.core.CastToStruct",                                        CheckerArray5, 0, false },
  { "alpha.core.DynamicTypeChecker",                                  CheckerArray6, 0, false },
  { "alpha.core.FixedAddr",                                           CheckerArray7, 0, false },
  { "alpha.core.IdenticalExpr",                                       CheckerArray8, 0, false },
  { "alpha.core.PointerArithm",                                       CheckerArray9, 0, false },
  { "alpha.core.PointerSub",                                          CheckerArray10, 0, false },
  { "alpha.core.SizeofPtr",                                           CheckerArray11, 0, false },
  { "alpha.core.TestAfterDivZero",                                    CheckerArray12, 0, false },
  { "alpha.cplusplus",                                                0, SubPackageArray13, true },
  { "alpha.cplusplus.VirtualCall",                                    CheckerArray14, 0, false },
  { "alpha.deadcode",                                                 0, SubPackageArray15, true },
  { "alpha.deadcode.UnreachableCode",                                 CheckerArray16, 0, false },
  { "alpha.osx",                                                      0, SubPackageArray17, true },
  { "alpha.osx.cocoa",                                                0, SubPackageArray18, true },
  { "alpha.osx.cocoa.DirectIvarAssignment",                           CheckerArray19, 0, false },
  { "alpha.osx.cocoa.DirectIvarAssignmentForAnnotatedFunctions",      CheckerArray20, 0, false },
  { "alpha.osx.cocoa.InstanceVariableInvalidation",                   CheckerArray21, 0, false },
  { "alpha.osx.cocoa.MissingInvalidationMethod",                      CheckerArray22, 0, false },
  { "alpha.osx.cocoa.localizability",                                 0, SubPackageArray23, true },
  { "alpha.osx.cocoa.localizability.PluralMisuseChecker",             CheckerArray24, 0, false },
  { "alpha.security",                                                 0, SubPackageArray25, true },
  { "alpha.security.ArrayBound",                                      CheckerArray26, 0, false },
  { "alpha.security.ArrayBoundV2",                                    CheckerArray27, 0, false },
  { "alpha.security.MallocOverflow",                                  CheckerArray28, 0, false },
  { "alpha.security.ReturnPtrRange",                                  CheckerArray29, 0, false },
  { "alpha.security.taint",                                           0, SubPackageArray30, true },
  { "alpha.security.taint.TaintPropagation",                          CheckerArray31, 0, false },
  { "alpha.unix",                                                     0, SubPackageArray32, true },
  { "alpha.unix.Chroot",                                              CheckerArray33, 0, false },
  { "alpha.unix.PthreadLock",                                         CheckerArray34, 0, false },
  { "alpha.unix.SimpleStream",                                        CheckerArray35, 0, false },
  { "alpha.unix.Stream",                                              CheckerArray36, 0, false },
  { "alpha.unix.cstring",                                             0, SubPackageArray37, true },
  { "alpha.unix.cstring.BufferOverlap",                               CheckerArray38, 0, false },
  { "alpha.unix.cstring.NotNullTerminated",                           CheckerArray39, 0, false },
  { "alpha.unix.cstring.OutOfBounds",                                 CheckerArray40, 0, false },
  { "core",                                                           0, SubPackageArray41, false },
  { "core.CallAndMessage",                                            CheckerArray42, 0, false },
  { "core.DivideZero",                                                CheckerArray43, 0, false },
  { "core.DynamicTypePropagation",                                    CheckerArray44, 0, false },
  { "core.NonNullParamChecker",                                       CheckerArray45, 0, false },
  { "core.NullDereference",                                           CheckerArray46, 0, false },
  { "core.StackAddressEscape",                                        CheckerArray47, 0, false },
  { "core.UndefinedBinaryOperatorResult",                             CheckerArray48, 0, false },
  { "core.VLASize",                                                   CheckerArray49, 0, false },
  { "core.builtin",                                                   0, SubPackageArray50, false },
  { "core.builtin.BuiltinFunctions",                                  CheckerArray51, 0, false },
  { "core.builtin.NoReturnFunctions",                                 CheckerArray52, 0, false },
  { "core.uninitialized",                                             0, SubPackageArray53, false },
  { "core.uninitialized.ArraySubscript",                              CheckerArray54, 0, false },
  { "core.uninitialized.Assign",                                      CheckerArray55, 0, false },
  { "core.uninitialized.Branch",                                      CheckerArray56, 0, false },
  { "core.uninitialized.CapturedBlockVariable",                       CheckerArray57, 0, false },
  { "core.uninitialized.UndefReturn",                                 CheckerArray58, 0, false },
  { "cplusplus",                                                      0, SubPackageArray59, false },
  { "cplusplus.NewDelete",                                            CheckerArray60, 0, false },
  { "cplusplus.NewDeleteLeaks",                                       CheckerArray61, 0, false },
  { "deadcode",                                                       0, SubPackageArray62, false },
  { "deadcode.DeadStores",                                            CheckerArray63, 0, false },
  { "debug",                                                          0, SubPackageArray64, false },
  { "debug.ConfigDumper",                                             CheckerArray65, 0, false },
  { "debug.DumpBugHash",                                              CheckerArray66, 0, false },
  { "debug.DumpCFG",                                                  CheckerArray67, 0, false },
  { "debug.DumpCallGraph",                                            CheckerArray68, 0, false },
  { "debug.DumpCalls",                                                CheckerArray69, 0, false },
  { "debug.DumpDominators",                                           CheckerArray70, 0, false },
  { "debug.DumpLiveVars",                                             CheckerArray71, 0, false },
  { "debug.DumpTraversal",                                            CheckerArray72, 0, false },
  { "debug.ExprInspection",                                           CheckerArray73, 0, false },
  { "debug.Stats",                                                    CheckerArray74, 0, false },
  { "debug.TaintTest",                                                CheckerArray75, 0, false },
  { "debug.ViewCFG",                                                  CheckerArray76, 0, false },
  { "debug.ViewCallGraph",                                            CheckerArray77, 0, false },
  { "debug.ViewExplodedGraph",                                        CheckerArray78, 0, false },
  { "llvm",                                                           0, SubPackageArray79, false },
  { "llvm.Conventions",                                               CheckerArray80, 0, false },
  { "nullability",                                                    0, SubPackageArray81, false },
  { "nullability.NullPassedToNonnull",                                CheckerArray82, 0, false },
  { "nullability.NullReturnedFromNonnull",                            CheckerArray83, 0, false },
  { "nullability.NullableDereferenced",                               CheckerArray84, 0, false },
  { "nullability.NullablePassedToNonnull",                            CheckerArray85, 0, false },
  { "optin",                                                          0, SubPackageArray86, false },
  { "optin.mpi",                                                      0, SubPackageArray87, false },
  { "optin.mpi.MPI-Checker",                                          CheckerArray88, 0, false },
  { "optin.osx",                                                      0, SubPackageArray89, false },
  { "optin.osx.cocoa",                                                0, SubPackageArray90, false },
  { "optin.osx.cocoa.localizability",                                 0, SubPackageArray91, false },
  { "optin.osx.cocoa.localizability.EmptyLocalizationContextChecker", CheckerArray92, 0, false },
  { "optin.osx.cocoa.localizability.NonLocalizedStringChecker",       CheckerArray93, 0, false },
  { "optin.performance",                                              0, SubPackageArray94, false },
  { "optin.performance.Padding",                                      CheckerArray95, 0, false },
  { "osx",                                                            0, SubPackageArray96, false },
  { "osx.API",                                                        CheckerArray97, 0, false },
  { "osx.SecKeychainAPI",                                             CheckerArray98, 0, false },
  { "osx.cocoa",                                                      0, SubPackageArray99, false },
  { "osx.cocoa.AtSync",                                               CheckerArray100, 0, false },
  { "osx.cocoa.ClassRelease",                                         CheckerArray101, 0, false },
  { "osx.cocoa.Dealloc",                                              CheckerArray102, 0, false },
  { "osx.cocoa.IncompatibleMethodTypes",                              CheckerArray103, 0, false },
  { "osx.cocoa.Loops",                                                CheckerArray104, 0, false },
  { "osx.cocoa.MissingSuperCall",                                     CheckerArray105, 0, false },
  { "osx.cocoa.NSAutoreleasePool",                                    CheckerArray106, 0, false },
  { "osx.cocoa.NSError",                                              CheckerArray107, 0, false },
  { "osx.cocoa.NilArg",                                               CheckerArray108, 0, false },
  { "osx.cocoa.NonNilReturnValue",                                    CheckerArray109, 0, false },
  { "osx.cocoa.ObjCGenerics",                                         CheckerArray110, 0, false },
  { "osx.cocoa.RetainCount",                                          CheckerArray111, 0, false },
  { "osx.cocoa.SelfInit",                                             CheckerArray112, 0, false },
  { "osx.cocoa.SuperDealloc",                                         CheckerArray113, 0, false },
  { "osx.cocoa.UnusedIvars",                                          CheckerArray114, 0, false },
  { "osx.cocoa.VariadicMethodTypes",                                  CheckerArray115, 0, false },
  { "osx.coreFoundation",                                             0, SubPackageArray116, false },
  { "osx.coreFoundation.CFError",                                     CheckerArray117, 0, false },
  { "osx.coreFoundation.CFNumber",                                    CheckerArray118, 0, false },
  { "osx.coreFoundation.CFRetainRelease",                             CheckerArray119, 0, false },
  { "osx.coreFoundation.containers",                                  0, SubPackageArray120, false },
  { "osx.coreFoundation.containers.OutOfBounds",                      CheckerArray121, 0, false },
  { "osx.coreFoundation.containers.PointerSizedValues",               CheckerArray122, 0, false },
  { "security",                                                       0, SubPackageArray123, false },
  { "security.FloatLoopCounter",                                      CheckerArray124, 0, false },
  { "security.insecureAPI",                                           0, SubPackageArray125, false },
  { "security.insecureAPI.UncheckedReturn",                           CheckerArray126, 0, false },
  { "security.insecureAPI.getpw",                                     CheckerArray127, 0, false },
  { "security.insecureAPI.gets",                                      CheckerArray128, 0, false },
  { "security.insecureAPI.mkstemp",                                   CheckerArray129, 0, false },
  { "security.insecureAPI.mktemp",                                    CheckerArray130, 0, false },
  { "security.insecureAPI.rand",                                      CheckerArray131, 0, false },
  { "security.insecureAPI.strcpy",                                    CheckerArray132, 0, false },
  { "security.insecureAPI.vfork",                                     CheckerArray133, 0, false },
  { "unix",                                                           0, SubPackageArray134, false },
  { "unix.API",                                                       CheckerArray135, 0, false },
  { "unix.Malloc",                                                    CheckerArray136, 0, false },
  { "unix.MallocSizeof",                                              CheckerArray137, 0, false },
  { "unix.MismatchedDeallocator",                                     CheckerArray138, 0, false },
  { "unix.Vfork",                                                     CheckerArray139, 0, false },
  { "unix.cstring",                                                   0, SubPackageArray140, true },
  { "unix.cstring.BadSizeArg",                                        CheckerArray141, 0, false },
  { "unix.cstring.NullArg",                                           CheckerArray142, 0, false },
#endif // GET_CHECKNAME_TABLE


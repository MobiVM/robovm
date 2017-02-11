/*===- TableGen'erated file -------------------------------------*- C++ -*-===*\
|*                                                                            *|
|* Template instantiation code for attributes                                 *|
|*                                                                            *|
|* Automatically generated file, do not edit!                                 *|
|*                                                                            *|
\*===----------------------------------------------------------------------===*/

namespace clang {
namespace sema {

Attr *instantiateTemplateAttribute(const Attr *At, ASTContext &C, Sema &S,
        const MultiLevelTemplateArgumentList &TemplateArgs) {
  switch (At->getKind()) {
    case attr::AMDGPUNumSGPR: {
      const auto *A = cast<AMDGPUNumSGPRAttr>(At);
      return A->clone(C);
    }
    case attr::AMDGPUNumVGPR: {
      const auto *A = cast<AMDGPUNumVGPRAttr>(At);
      return A->clone(C);
    }
    case attr::ARMInterrupt: {
      const auto *A = cast<ARMInterruptAttr>(At);
      return A->clone(C);
    }
    case attr::AbiTag: {
      const auto *A = cast<AbiTagAttr>(At);
      return A->clone(C);
    }
    case attr::AcquireCapability: {
      const auto *A = cast<AcquireCapabilityAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) AcquireCapabilityAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::AcquiredAfter: {
      const auto *A = cast<AcquiredAfterAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) AcquiredAfterAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::AcquiredBefore: {
      const auto *A = cast<AcquiredBeforeAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) AcquiredBeforeAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::Alias: {
      const auto *A = cast<AliasAttr>(At);
      return A->clone(C);
    }
    case attr::AlignMac68k: {
      const auto *A = cast<AlignMac68kAttr>(At);
      return A->clone(C);
    }
    case attr::AlignValue: {
      const auto *A = cast<AlignValueAttr>(At);
      return A->clone(C);
    }
    case attr::Aligned: {
      const auto *A = cast<AlignedAttr>(At);
      return A->clone(C);
    }
    case attr::AlwaysInline: {
      const auto *A = cast<AlwaysInlineAttr>(At);
      return A->clone(C);
    }
    case attr::AnalyzerNoReturn: {
      const auto *A = cast<AnalyzerNoReturnAttr>(At);
      return A->clone(C);
    }
    case attr::Annotate: {
      const auto *A = cast<AnnotateAttr>(At);
      return A->clone(C);
    }
    case attr::AnyX86Interrupt: {
      const auto *A = cast<AnyX86InterruptAttr>(At);
      return A->clone(C);
    }
    case attr::ArcWeakrefUnavailable: {
      const auto *A = cast<ArcWeakrefUnavailableAttr>(At);
      return A->clone(C);
    }
    case attr::ArgumentWithTypeTag: {
      const auto *A = cast<ArgumentWithTypeTagAttr>(At);
      return A->clone(C);
    }
    case attr::AsmLabel: {
      const auto *A = cast<AsmLabelAttr>(At);
      return A->clone(C);
    }
    case attr::AssertCapability: {
      const auto *A = cast<AssertCapabilityAttr>(At);
      Expr * tempInstExpr;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getExpr(), TemplateArgs);
        tempInstExpr = Result.getAs<Expr>();
      }
      return new (C) AssertCapabilityAttr(A->getLocation(), C, tempInstExpr, A->getSpellingListIndex());
    }
    case attr::AssertExclusiveLock: {
      const auto *A = cast<AssertExclusiveLockAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) AssertExclusiveLockAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::AssertSharedLock: {
      const auto *A = cast<AssertSharedLockAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) AssertSharedLockAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::AssumeAligned: {
      const auto *A = cast<AssumeAlignedAttr>(At);
      return A->clone(C);
    }
    case attr::Availability: {
      const auto *A = cast<AvailabilityAttr>(At);
      return A->clone(C);
    }
    case attr::Blocks: {
      const auto *A = cast<BlocksAttr>(At);
      return A->clone(C);
    }
    case attr::C11NoReturn: {
      const auto *A = cast<C11NoReturnAttr>(At);
      return A->clone(C);
    }
    case attr::CDecl: {
      const auto *A = cast<CDeclAttr>(At);
      return A->clone(C);
    }
    case attr::CFAuditedTransfer: {
      const auto *A = cast<CFAuditedTransferAttr>(At);
      return A->clone(C);
    }
    case attr::CFConsumed: {
      const auto *A = cast<CFConsumedAttr>(At);
      return A->clone(C);
    }
    case attr::CFReturnsNotRetained: {
      const auto *A = cast<CFReturnsNotRetainedAttr>(At);
      return A->clone(C);
    }
    case attr::CFReturnsRetained: {
      const auto *A = cast<CFReturnsRetainedAttr>(At);
      return A->clone(C);
    }
    case attr::CFUnknownTransfer: {
      const auto *A = cast<CFUnknownTransferAttr>(At);
      return A->clone(C);
    }
    case attr::CUDAConstant: {
      const auto *A = cast<CUDAConstantAttr>(At);
      return A->clone(C);
    }
    case attr::CUDADevice: {
      const auto *A = cast<CUDADeviceAttr>(At);
      return A->clone(C);
    }
    case attr::CUDAGlobal: {
      const auto *A = cast<CUDAGlobalAttr>(At);
      return A->clone(C);
    }
    case attr::CUDAHost: {
      const auto *A = cast<CUDAHostAttr>(At);
      return A->clone(C);
    }
    case attr::CUDAInvalidTarget: {
      const auto *A = cast<CUDAInvalidTargetAttr>(At);
      return A->clone(C);
    }
    case attr::CUDALaunchBounds: {
      const auto *A = cast<CUDALaunchBoundsAttr>(At);
      return A->clone(C);
    }
    case attr::CUDAShared: {
      const auto *A = cast<CUDASharedAttr>(At);
      return A->clone(C);
    }
    case attr::CXX11NoReturn: {
      const auto *A = cast<CXX11NoReturnAttr>(At);
      return A->clone(C);
    }
    case attr::CallableWhen: {
      const auto *A = cast<CallableWhenAttr>(At);
      return A->clone(C);
    }
    case attr::Capability: {
      const auto *A = cast<CapabilityAttr>(At);
      return A->clone(C);
    }
    case attr::CapturedRecord: {
      const auto *A = cast<CapturedRecordAttr>(At);
      return A->clone(C);
    }
    case attr::CarriesDependency: {
      const auto *A = cast<CarriesDependencyAttr>(At);
      return A->clone(C);
    }
    case attr::Cleanup: {
      const auto *A = cast<CleanupAttr>(At);
      return A->clone(C);
    }
    case attr::Cold: {
      const auto *A = cast<ColdAttr>(At);
      return A->clone(C);
    }
    case attr::Common: {
      const auto *A = cast<CommonAttr>(At);
      return A->clone(C);
    }
    case attr::Const: {
      const auto *A = cast<ConstAttr>(At);
      return A->clone(C);
    }
    case attr::Constructor: {
      const auto *A = cast<ConstructorAttr>(At);
      return A->clone(C);
    }
    case attr::Consumable: {
      const auto *A = cast<ConsumableAttr>(At);
      return A->clone(C);
    }
    case attr::ConsumableAutoCast: {
      const auto *A = cast<ConsumableAutoCastAttr>(At);
      return A->clone(C);
    }
    case attr::ConsumableSetOnRead: {
      const auto *A = cast<ConsumableSetOnReadAttr>(At);
      return A->clone(C);
    }
    case attr::DLLExport: {
      const auto *A = cast<DLLExportAttr>(At);
      return A->clone(C);
    }
    case attr::DLLImport: {
      const auto *A = cast<DLLImportAttr>(At);
      return A->clone(C);
    }
    case attr::Deprecated: {
      const auto *A = cast<DeprecatedAttr>(At);
      return A->clone(C);
    }
    case attr::Destructor: {
      const auto *A = cast<DestructorAttr>(At);
      return A->clone(C);
    }
    case attr::DisableTailCalls: {
      const auto *A = cast<DisableTailCallsAttr>(At);
      return A->clone(C);
    }
    case attr::EmptyBases: {
      const auto *A = cast<EmptyBasesAttr>(At);
      return A->clone(C);
    }
    case attr::EnableIf: {
      const auto *A = cast<EnableIfAttr>(At);
      Expr * tempInstCond;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getCond(), TemplateArgs);
        tempInstCond = Result.getAs<Expr>();
      }
      return new (C) EnableIfAttr(A->getLocation(), C, tempInstCond, A->getMessage(), A->getSpellingListIndex());
    }
    case attr::ExclusiveTrylockFunction: {
      const auto *A = cast<ExclusiveTrylockFunctionAttr>(At);
      Expr * tempInstSuccessValue;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getSuccessValue(), TemplateArgs);
        tempInstSuccessValue = Result.getAs<Expr>();
      }
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) ExclusiveTrylockFunctionAttr(A->getLocation(), C, tempInstSuccessValue, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::FallThrough: {
      const auto *A = cast<FallThroughAttr>(At);
      return A->clone(C);
    }
    case attr::FastCall: {
      const auto *A = cast<FastCallAttr>(At);
      return A->clone(C);
    }
    case attr::Final: {
      const auto *A = cast<FinalAttr>(At);
      return A->clone(C);
    }
    case attr::FlagEnum: {
      const auto *A = cast<FlagEnumAttr>(At);
      return A->clone(C);
    }
    case attr::Flatten: {
      const auto *A = cast<FlattenAttr>(At);
      return A->clone(C);
    }
    case attr::Format: {
      const auto *A = cast<FormatAttr>(At);
      return A->clone(C);
    }
    case attr::FormatArg: {
      const auto *A = cast<FormatArgAttr>(At);
      return A->clone(C);
    }
    case attr::GNUInline: {
      const auto *A = cast<GNUInlineAttr>(At);
      return A->clone(C);
    }
    case attr::GuardedBy: {
      const auto *A = cast<GuardedByAttr>(At);
      Expr * tempInstArg;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getArg(), TemplateArgs);
        tempInstArg = Result.getAs<Expr>();
      }
      return new (C) GuardedByAttr(A->getLocation(), C, tempInstArg, A->getSpellingListIndex());
    }
    case attr::GuardedVar: {
      const auto *A = cast<GuardedVarAttr>(At);
      return A->clone(C);
    }
    case attr::Hot: {
      const auto *A = cast<HotAttr>(At);
      return A->clone(C);
    }
    case attr::IBAction: {
      const auto *A = cast<IBActionAttr>(At);
      return A->clone(C);
    }
    case attr::IBOutlet: {
      const auto *A = cast<IBOutletAttr>(At);
      return A->clone(C);
    }
    case attr::IBOutletCollection: {
      const auto *A = cast<IBOutletCollectionAttr>(At);
      return A->clone(C);
    }
    case attr::IFunc: {
      const auto *A = cast<IFuncAttr>(At);
      return A->clone(C);
    }
    case attr::InitPriority: {
      const auto *A = cast<InitPriorityAttr>(At);
      return A->clone(C);
    }
    case attr::InitSeg: {
      const auto *A = cast<InitSegAttr>(At);
      return A->clone(C);
    }
    case attr::IntelOclBicc: {
      const auto *A = cast<IntelOclBiccAttr>(At);
      return A->clone(C);
    }
    case attr::InternalLinkage: {
      const auto *A = cast<InternalLinkageAttr>(At);
      return A->clone(C);
    }
    case attr::LTOVisibilityPublic: {
      const auto *A = cast<LTOVisibilityPublicAttr>(At);
      return A->clone(C);
    }
    case attr::LayoutVersion: {
      const auto *A = cast<LayoutVersionAttr>(At);
      return A->clone(C);
    }
    case attr::LockReturned: {
      const auto *A = cast<LockReturnedAttr>(At);
      Expr * tempInstArg;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getArg(), TemplateArgs);
        tempInstArg = Result.getAs<Expr>();
      }
      return new (C) LockReturnedAttr(A->getLocation(), C, tempInstArg, A->getSpellingListIndex());
    }
    case attr::LocksExcluded: {
      const auto *A = cast<LocksExcludedAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) LocksExcludedAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::LoopHint: {
      const auto *A = cast<LoopHintAttr>(At);
      return A->clone(C);
    }
    case attr::MSABI: {
      const auto *A = cast<MSABIAttr>(At);
      return A->clone(C);
    }
    case attr::MSInheritance: {
      const auto *A = cast<MSInheritanceAttr>(At);
      return A->clone(C);
    }
    case attr::MSNoVTable: {
      const auto *A = cast<MSNoVTableAttr>(At);
      return A->clone(C);
    }
    case attr::MSP430Interrupt: {
      const auto *A = cast<MSP430InterruptAttr>(At);
      return A->clone(C);
    }
    case attr::MSStruct: {
      const auto *A = cast<MSStructAttr>(At);
      return A->clone(C);
    }
    case attr::MSVtorDisp: {
      const auto *A = cast<MSVtorDispAttr>(At);
      return A->clone(C);
    }
    case attr::MaxFieldAlignment: {
      const auto *A = cast<MaxFieldAlignmentAttr>(At);
      return A->clone(C);
    }
    case attr::MayAlias: {
      const auto *A = cast<MayAliasAttr>(At);
      return A->clone(C);
    }
    case attr::MinSize: {
      const auto *A = cast<MinSizeAttr>(At);
      return A->clone(C);
    }
    case attr::Mips16: {
      const auto *A = cast<Mips16Attr>(At);
      return A->clone(C);
    }
    case attr::MipsInterrupt: {
      const auto *A = cast<MipsInterruptAttr>(At);
      return A->clone(C);
    }
    case attr::Mode: {
      const auto *A = cast<ModeAttr>(At);
      return A->clone(C);
    }
    case attr::NSConsumed: {
      const auto *A = cast<NSConsumedAttr>(At);
      return A->clone(C);
    }
    case attr::NSConsumesSelf: {
      const auto *A = cast<NSConsumesSelfAttr>(At);
      return A->clone(C);
    }
    case attr::NSReturnsAutoreleased: {
      const auto *A = cast<NSReturnsAutoreleasedAttr>(At);
      return A->clone(C);
    }
    case attr::NSReturnsNotRetained: {
      const auto *A = cast<NSReturnsNotRetainedAttr>(At);
      return A->clone(C);
    }
    case attr::NSReturnsRetained: {
      const auto *A = cast<NSReturnsRetainedAttr>(At);
      return A->clone(C);
    }
    case attr::Naked: {
      const auto *A = cast<NakedAttr>(At);
      return A->clone(C);
    }
    case attr::NoAlias: {
      const auto *A = cast<NoAliasAttr>(At);
      return A->clone(C);
    }
    case attr::NoCommon: {
      const auto *A = cast<NoCommonAttr>(At);
      return A->clone(C);
    }
    case attr::NoDebug: {
      const auto *A = cast<NoDebugAttr>(At);
      return A->clone(C);
    }
    case attr::NoDuplicate: {
      const auto *A = cast<NoDuplicateAttr>(At);
      return A->clone(C);
    }
    case attr::NoInline: {
      const auto *A = cast<NoInlineAttr>(At);
      return A->clone(C);
    }
    case attr::NoInstrumentFunction: {
      const auto *A = cast<NoInstrumentFunctionAttr>(At);
      return A->clone(C);
    }
    case attr::NoMips16: {
      const auto *A = cast<NoMips16Attr>(At);
      return A->clone(C);
    }
    case attr::NoReturn: {
      const auto *A = cast<NoReturnAttr>(At);
      return A->clone(C);
    }
    case attr::NoSanitize: {
      const auto *A = cast<NoSanitizeAttr>(At);
      return A->clone(C);
    }
    case attr::NoSplitStack: {
      const auto *A = cast<NoSplitStackAttr>(At);
      return A->clone(C);
    }
    case attr::NoThreadSafetyAnalysis: {
      const auto *A = cast<NoThreadSafetyAnalysisAttr>(At);
      return A->clone(C);
    }
    case attr::NoThrow: {
      const auto *A = cast<NoThrowAttr>(At);
      return A->clone(C);
    }
    case attr::NonNull: {
      const auto *A = cast<NonNullAttr>(At);
      return A->clone(C);
    }
    case attr::NotTailCalled: {
      const auto *A = cast<NotTailCalledAttr>(At);
      return A->clone(C);
    }
    case attr::OMPCaptureNoInit: {
      const auto *A = cast<OMPCaptureNoInitAttr>(At);
      return A->clone(C);
    }
    case attr::OMPDeclareSimdDecl: {
      const auto *A = cast<OMPDeclareSimdDeclAttr>(At);
      return A->clone(C);
    }
    case attr::OMPDeclareTargetDecl: {
      const auto *A = cast<OMPDeclareTargetDeclAttr>(At);
      return A->clone(C);
    }
    case attr::OMPThreadPrivateDecl: {
      const auto *A = cast<OMPThreadPrivateDeclAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCBoxable: {
      const auto *A = cast<ObjCBoxableAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCBridge: {
      const auto *A = cast<ObjCBridgeAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCBridgeMutable: {
      const auto *A = cast<ObjCBridgeMutableAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCBridgeRelated: {
      const auto *A = cast<ObjCBridgeRelatedAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCDesignatedInitializer: {
      const auto *A = cast<ObjCDesignatedInitializerAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCException: {
      const auto *A = cast<ObjCExceptionAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCExplicitProtocolImpl: {
      const auto *A = cast<ObjCExplicitProtocolImplAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCIndependentClass: {
      const auto *A = cast<ObjCIndependentClassAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCMethodFamily: {
      const auto *A = cast<ObjCMethodFamilyAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCNSObject: {
      const auto *A = cast<ObjCNSObjectAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCPreciseLifetime: {
      const auto *A = cast<ObjCPreciseLifetimeAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCRequiresPropertyDefs: {
      const auto *A = cast<ObjCRequiresPropertyDefsAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCRequiresSuper: {
      const auto *A = cast<ObjCRequiresSuperAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCReturnsInnerPointer: {
      const auto *A = cast<ObjCReturnsInnerPointerAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCRootClass: {
      const auto *A = cast<ObjCRootClassAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCRuntimeName: {
      const auto *A = cast<ObjCRuntimeNameAttr>(At);
      return A->clone(C);
    }
    case attr::ObjCRuntimeVisible: {
      const auto *A = cast<ObjCRuntimeVisibleAttr>(At);
      return A->clone(C);
    }
    case attr::OpenCLAccess: {
      const auto *A = cast<OpenCLAccessAttr>(At);
      return A->clone(C);
    }
    case attr::OpenCLKernel: {
      const auto *A = cast<OpenCLKernelAttr>(At);
      return A->clone(C);
    }
    case attr::OpenCLUnrollHint: {
      const auto *A = cast<OpenCLUnrollHintAttr>(At);
      return A->clone(C);
    }
    case attr::OptimizeNone: {
      const auto *A = cast<OptimizeNoneAttr>(At);
      return A->clone(C);
    }
    case attr::Overloadable: {
      const auto *A = cast<OverloadableAttr>(At);
      return A->clone(C);
    }
    case attr::Override: {
      const auto *A = cast<OverrideAttr>(At);
      return A->clone(C);
    }
    case attr::Ownership: {
      const auto *A = cast<OwnershipAttr>(At);
      return A->clone(C);
    }
    case attr::Packed: {
      const auto *A = cast<PackedAttr>(At);
      return A->clone(C);
    }
    case attr::ParamTypestate: {
      const auto *A = cast<ParamTypestateAttr>(At);
      return A->clone(C);
    }
    case attr::Pascal: {
      const auto *A = cast<PascalAttr>(At);
      return A->clone(C);
    }
    case attr::PassObjectSize: {
      const auto *A = cast<PassObjectSizeAttr>(At);
      return A->clone(C);
    }
    case attr::Pcs: {
      const auto *A = cast<PcsAttr>(At);
      return A->clone(C);
    }
    case attr::PreserveAll: {
      const auto *A = cast<PreserveAllAttr>(At);
      return A->clone(C);
    }
    case attr::PreserveMost: {
      const auto *A = cast<PreserveMostAttr>(At);
      return A->clone(C);
    }
    case attr::PtGuardedBy: {
      const auto *A = cast<PtGuardedByAttr>(At);
      Expr * tempInstArg;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getArg(), TemplateArgs);
        tempInstArg = Result.getAs<Expr>();
      }
      return new (C) PtGuardedByAttr(A->getLocation(), C, tempInstArg, A->getSpellingListIndex());
    }
    case attr::PtGuardedVar: {
      const auto *A = cast<PtGuardedVarAttr>(At);
      return A->clone(C);
    }
    case attr::Pure: {
      const auto *A = cast<PureAttr>(At);
      return A->clone(C);
    }
    case attr::ReleaseCapability: {
      const auto *A = cast<ReleaseCapabilityAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) ReleaseCapabilityAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::RenderScriptKernel: {
      const auto *A = cast<RenderScriptKernelAttr>(At);
      return A->clone(C);
    }
    case attr::ReqdWorkGroupSize: {
      const auto *A = cast<ReqdWorkGroupSizeAttr>(At);
      return A->clone(C);
    }
    case attr::RequiresCapability: {
      const auto *A = cast<RequiresCapabilityAttr>(At);
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) RequiresCapabilityAttr(A->getLocation(), C, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::Restrict: {
      const auto *A = cast<RestrictAttr>(At);
      return A->clone(C);
    }
    case attr::ReturnTypestate: {
      const auto *A = cast<ReturnTypestateAttr>(At);
      return A->clone(C);
    }
    case attr::ReturnsNonNull: {
      const auto *A = cast<ReturnsNonNullAttr>(At);
      return A->clone(C);
    }
    case attr::ReturnsTwice: {
      const auto *A = cast<ReturnsTwiceAttr>(At);
      return A->clone(C);
    }
    case attr::ScopedLockable: {
      const auto *A = cast<ScopedLockableAttr>(At);
      return A->clone(C);
    }
    case attr::Section: {
      const auto *A = cast<SectionAttr>(At);
      return A->clone(C);
    }
    case attr::SelectAny: {
      const auto *A = cast<SelectAnyAttr>(At);
      return A->clone(C);
    }
    case attr::Sentinel: {
      const auto *A = cast<SentinelAttr>(At);
      return A->clone(C);
    }
    case attr::SetTypestate: {
      const auto *A = cast<SetTypestateAttr>(At);
      return A->clone(C);
    }
    case attr::SharedTrylockFunction: {
      const auto *A = cast<SharedTrylockFunctionAttr>(At);
      Expr * tempInstSuccessValue;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getSuccessValue(), TemplateArgs);
        tempInstSuccessValue = Result.getAs<Expr>();
      }
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) SharedTrylockFunctionAttr(A->getLocation(), C, tempInstSuccessValue, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::StdCall: {
      const auto *A = cast<StdCallAttr>(At);
      return A->clone(C);
    }
    case attr::SwiftCall: {
      const auto *A = cast<SwiftCallAttr>(At);
      return A->clone(C);
    }
    case attr::SwiftContext: {
      const auto *A = cast<SwiftContextAttr>(At);
      return A->clone(C);
    }
    case attr::SwiftErrorResult: {
      const auto *A = cast<SwiftErrorResultAttr>(At);
      return A->clone(C);
    }
    case attr::SwiftIndirectResult: {
      const auto *A = cast<SwiftIndirectResultAttr>(At);
      return A->clone(C);
    }
    case attr::SysVABI: {
      const auto *A = cast<SysVABIAttr>(At);
      return A->clone(C);
    }
    case attr::TLSModel: {
      const auto *A = cast<TLSModelAttr>(At);
      return A->clone(C);
    }
    case attr::Target: {
      const auto *A = cast<TargetAttr>(At);
      return A->clone(C);
    }
    case attr::TestTypestate: {
      const auto *A = cast<TestTypestateAttr>(At);
      return A->clone(C);
    }
    case attr::ThisCall: {
      const auto *A = cast<ThisCallAttr>(At);
      return A->clone(C);
    }
    case attr::Thread: {
      const auto *A = cast<ThreadAttr>(At);
      return A->clone(C);
    }
    case attr::TransparentUnion: {
      const auto *A = cast<TransparentUnionAttr>(At);
      return A->clone(C);
    }
    case attr::TryAcquireCapability: {
      const auto *A = cast<TryAcquireCapabilityAttr>(At);
      Expr * tempInstSuccessValue;
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        ExprResult Result = S.SubstExpr(A->getSuccessValue(), TemplateArgs);
        tempInstSuccessValue = Result.getAs<Expr>();
      }
      auto *tempInstArgs = new (C, 16) Expr *[A->args_size()];
      {
        EnterExpressionEvaluationContext Unevaluated(S, Sema::Unevaluated);
        Expr * *TI = tempInstArgs;
        Expr * *I = A->args_begin();
        Expr * *E = A->args_end();
        for (; I != E; ++I, ++TI) {
          ExprResult Result = S.SubstExpr(*I, TemplateArgs);
          *TI = Result.getAs<Expr>();
        }
      }
      return new (C) TryAcquireCapabilityAttr(A->getLocation(), C, tempInstSuccessValue, tempInstArgs, A->args_size(), A->getSpellingListIndex());
    }
    case attr::TypeTagForDatatype: {
      const auto *A = cast<TypeTagForDatatypeAttr>(At);
      return A->clone(C);
    }
    case attr::TypeVisibility: {
      return nullptr;
    }
    case attr::Unavailable: {
      const auto *A = cast<UnavailableAttr>(At);
      return A->clone(C);
    }
    case attr::Unused: {
      const auto *A = cast<UnusedAttr>(At);
      return A->clone(C);
    }
    case attr::Used: {
      const auto *A = cast<UsedAttr>(At);
      return A->clone(C);
    }
    case attr::Uuid: {
      const auto *A = cast<UuidAttr>(At);
      return A->clone(C);
    }
    case attr::VecReturn: {
      const auto *A = cast<VecReturnAttr>(At);
      return A->clone(C);
    }
    case attr::VecTypeHint: {
      const auto *A = cast<VecTypeHintAttr>(At);
      return A->clone(C);
    }
    case attr::VectorCall: {
      const auto *A = cast<VectorCallAttr>(At);
      return A->clone(C);
    }
    case attr::Visibility: {
      return nullptr;
    }
    case attr::WarnUnused: {
      const auto *A = cast<WarnUnusedAttr>(At);
      return A->clone(C);
    }
    case attr::WarnUnusedResult: {
      const auto *A = cast<WarnUnusedResultAttr>(At);
      return A->clone(C);
    }
    case attr::Weak: {
      const auto *A = cast<WeakAttr>(At);
      return A->clone(C);
    }
    case attr::WeakImport: {
      const auto *A = cast<WeakImportAttr>(At);
      return A->clone(C);
    }
    case attr::WeakRef: {
      const auto *A = cast<WeakRefAttr>(At);
      return A->clone(C);
    }
    case attr::WorkGroupSizeHint: {
      const auto *A = cast<WorkGroupSizeHintAttr>(At);
      return A->clone(C);
    }
    case attr::X86ForceAlignArgPointer: {
      const auto *A = cast<X86ForceAlignArgPointerAttr>(At);
      return A->clone(C);
    }
    case attr::XRayInstrument: {
      const auto *A = cast<XRayInstrumentAttr>(At);
      return A->clone(C);
    }
  } // end switch
  llvm_unreachable("Unknown attribute!");
  return nullptr;
}

} // end namespace sema
} // end namespace clang

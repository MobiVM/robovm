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
package org.robovm.compiler.llvm.debug.dwarf;

/**
 * Dwarf constants as gleaned from the DWARF Debugging Information Format V.4
 * reference manual http://www.dwarfstd.org/.
 * translated from compiler/llvm/src/main/swig/include/llvm/Support/Dwarf.h
 */
@SuppressWarnings("unused")
public class DwarfConst {


    public static class LLVMConstants {
        // llvm mock tags
        public final static int TAG_invalid = ~0; // Tag for invalid results.

        public final static int TAG_auto_variable = 0x100; // Tag for local (auto) variables.
        public final static int TAG_arg_variable = 0x101;  // Tag for argument variables.
        public final static int TAG_expression = 0x102;    // Tag for complex address expressions.

        public final static int TAG_user_base = 0x1000; // Recommended base for user tags.

        public final static int DWARF_VERSION = 4;       // Default dwarf version we output.
        public final static int PUBTYPES_VERSION = 2; // Section version number for .debug_pubtypes.
        public final static int PUBNAMES_VERSION = 2; // Section version number for .debug_pubnames.
        public final static int ARANGES_VERSION = 2;   // Section version number for .debug_aranges.
    }


    public static class Tag {
        public final static int TAG_array_type = 0x01;
        public final static int TAG_class_type = 0x02;
        public final static int TAG_entry_point = 0x03;
        public final static int TAG_enumeration_type = 0x04;
        public final static int TAG_formal_parameter = 0x05;
        public final static int TAG_imported_declaration = 0x08;
        public final static int TAG_label = 0x0a;
        public final static int TAG_lexical_block = 0x0b;
        public final static int TAG_member = 0x0d;
        public final static int TAG_pointer_type = 0x0f;
        public final static int TAG_reference_type = 0x10;
        public final static int TAG_compile_unit = 0x11;
        public final static int TAG_string_type = 0x12;
        public final static int TAG_structure_type = 0x13;
        public final static int TAG_subroutine_type = 0x15;
        public final static int TAG_typedef = 0x16;
        public final static int TAG_union_type = 0x17;
        public final static int TAG_unspecified_parameters = 0x18;
        public final static int TAG_variant = 0x19;
        public final static int TAG_common_block = 0x1a;
        public final static int TAG_common_inclusion = 0x1b;
        public final static int TAG_inheritance = 0x1c;
        public final static int TAG_inlined_subroutine = 0x1d;
        public final static int TAG_module = 0x1e;
        public final static int TAG_ptr_to_member_type = 0x1f;
        public final static int TAG_set_type = 0x20;
        public final static int TAG_subrange_type = 0x21;
        public final static int TAG_with_stmt = 0x22;
        public final static int TAG_access_declaration = 0x23;
        public final static int TAG_base_type = 0x24;
        public final static int TAG_catch_block = 0x25;
        public final static int TAG_const_type = 0x26;
        public final static int TAG_constant = 0x27;
        public final static int TAG_enumerator = 0x28;
        public final static int TAG_file_type = 0x29;
        public final static int TAG_friend = 0x2a;
        public final static int TAG_namelist = 0x2b;
        public final static int TAG_namelist_item = 0x2c;
        public final static int TAG_packed_type = 0x2d;
        public final static int TAG_subprogram = 0x2e;
        public final static int TAG_template_type_parameter = 0x2f;
        public final static int TAG_template_value_parameter = 0x30;
        public final static int TAG_thrown_type = 0x31;
        public final static int TAG_try_block = 0x32;
        public final static int TAG_variant_part = 0x33;
        public final static int TAG_variable = 0x34;
        public final static int TAG_volatile_type = 0x35;
        public final static int TAG_dwarf_procedure = 0x36;
        public final static int TAG_restrict_type = 0x37;
        public final static int TAG_interface_type = 0x38;
        public final static int TAG_namespace = 0x39;
        public final static int TAG_imported_module = 0x3a;
        public final static int TAG_unspecified_type = 0x3b;
        public final static int TAG_partial_unit = 0x3c;
        public final static int TAG_imported_unit = 0x3d;
        public final static int TAG_condition = 0x3f;
        public final static int TAG_shared_type = 0x40;
        public final static int TAG_type_unit = 0x41;
        public final static int TAG_rvalue_reference_type = 0x42;
        public final static int TAG_template_alias = 0x43;

        // New in DWARF 5:
        public final static int TAG_coarray_type = 0x44;
        public final static int TAG_generic_subrange = 0x45;
        public final static int TAG_dynamic_type = 0x46;

        public final static int TAG_MIPS_loop = 0x4081;
        public final static int TAG_format_label = 0x4101;
        public final static int TAG_function_template = 0x4102;
        public final static int TAG_class_template = 0x4103;
        public final static int TAG_GNU_template_template_param = 0x4106;
        public final static int TAG_GNU_template_parameter_pack = 0x4107;
        public final static int TAG_GNU_formal_parameter_pack = 0x4108;
        public final static int TAG_lo_user = 0x4080;
        public final static int TAG_APPLE_property = 0x4200;
        public final static int TAG_hi_user = 0xffff;
    }

    public static class Attribute {
        // Attributes
        public final static int AT_sibling = 0x01;
        public final static int AT_location = 0x02;
        public final static int AT_name = 0x03;
        public final static int AT_ordering = 0x09;
        public final static int AT_byte_size = 0x0b;
        public final static int AT_bit_offset = 0x0c;
        public final static int AT_bit_size = 0x0d;
        public final static int AT_stmt_list = 0x10;
        public final static int AT_low_pc = 0x11;
        public final static int AT_high_pc = 0x12;
        public final static int AT_language = 0x13;
        public final static int AT_discr = 0x15;
        public final static int AT_discr_value = 0x16;
        public final static int AT_visibility = 0x17;
        public final static int AT_import = 0x18;
        public final static int AT_string_length = 0x19;
        public final static int AT_common_reference = 0x1a;
        public final static int AT_comp_dir = 0x1b;
        public final static int AT_const_value = 0x1c;
        public final static int AT_containing_type = 0x1d;
        public final static int AT_default_value = 0x1e;
        public final static int AT_inline = 0x20;
        public final static int AT_is_optional = 0x21;
        public final static int AT_lower_bound = 0x22;
        public final static int AT_producer = 0x25;
        public final static int AT_prototyped = 0x27;
        public final static int AT_return_addr = 0x2a;
        public final static int AT_start_scope = 0x2c;
        public final static int AT_bit_stride = 0x2e;
        public final static int AT_upper_bound = 0x2f;
        public final static int AT_abstract_origin = 0x31;
        public final static int AT_accessibility = 0x32;
        public final static int AT_address_class = 0x33;
        public final static int AT_artificial = 0x34;
        public final static int AT_base_types = 0x35;
        public final static int AT_calling_convention = 0x36;
        public final static int AT_count = 0x37;
        public final static int AT_data_member_location = 0x38;
        public final static int AT_decl_column = 0x39;
        public final static int AT_decl_file = 0x3a;
        public final static int AT_decl_line = 0x3b;
        public final static int AT_declaration = 0x3c;
        public final static int AT_discr_list = 0x3d;
        public final static int AT_encoding = 0x3e;
        public final static int AT_external = 0x3f;
        public final static int AT_frame_base = 0x40;
        public final static int AT_friend = 0x41;
        public final static int AT_identifier_case = 0x42;
        public final static int AT_macro_info = 0x43;
        public final static int AT_namelist_item = 0x44;
        public final static int AT_priority = 0x45;
        public final static int AT_segment = 0x46;
        public final static int AT_specification = 0x47;
        public final static int AT_static_link = 0x48;
        public final static int AT_type = 0x49;
        public final static int AT_use_location = 0x4a;
        public final static int AT_variable_parameter = 0x4b;
        public final static int AT_virtuality = 0x4c;
        public final static int AT_vtable_elem_location = 0x4d;
        public final static int AT_allocated = 0x4e;
        public final static int AT_associated = 0x4f;
        public final static int AT_data_location = 0x50;
        public final static int AT_byte_stride = 0x51;
        public final static int AT_entry_pc = 0x52;
        public final static int AT_use_UTF8 = 0x53;
        public final static int AT_extension = 0x54;
        public final static int AT_ranges = 0x55;
        public final static int AT_trampoline = 0x56;
        public final static int AT_call_column = 0x57;
        public final static int AT_call_file = 0x58;
        public final static int AT_call_line = 0x59;
        public final static int AT_description = 0x5a;
        public final static int AT_binary_scale = 0x5b;
        public final static int AT_decimal_scale = 0x5c;
        public final static int AT_small = 0x5d;
        public final static int AT_decimal_sign = 0x5e;
        public final static int AT_digit_count = 0x5f;
        public final static int AT_picture_string = 0x60;
        public final static int AT_mutable = 0x61;
        public final static int AT_threads_scaled = 0x62;
        public final static int AT_explicit = 0x63;
        public final static int AT_object_pointer = 0x64;
        public final static int AT_endianity = 0x65;
        public final static int AT_elemental = 0x66;
        public final static int AT_pure = 0x67;
        public final static int AT_recursive = 0x68;
        public final static int AT_signature = 0x69;
        public final static int AT_main_subprogram = 0x6a;
        public final static int AT_data_bit_offset = 0x6b;
        public final static int AT_const_expr = 0x6c;
        public final static int AT_enum_class = 0x6d;
        public final static int AT_linkage_name = 0x6e;

        // New in DWARF 5:
        public final static int AT_string_length_bit_size = 0x6f;
        public final static int AT_string_length_byte_size = 0x70;
        public final static int AT_rank = 0x71;
        public final static int AT_str_offsets_base = 0x72;
        public final static int AT_addr_base = 0x73;
        public final static int AT_ranges_base = 0x74;
        public final static int AT_dwo_id = 0x75;
        public final static int AT_dwo_name = 0x76;
        public final static int AT_reference = 0x77;
        public final static int AT_rvalue_reference = 0x78;

        public final static int AT_lo_user = 0x2000;
        public final static int AT_hi_user = 0x3fff;

        public final static int AT_MIPS_loop_begin = 0x2002;
        public final static int AT_MIPS_tail_loop_begin = 0x2003;
        public final static int AT_MIPS_epilog_begin = 0x2004;
        public final static int AT_MIPS_loop_unroll_factor = 0x2005;
        public final static int AT_MIPS_software_pipeline_depth = 0x2006;
        public final static int AT_MIPS_linkage_name = 0x2007;
        public final static int AT_MIPS_stride = 0x2008;
        public final static int AT_MIPS_abstract_name = 0x2009;
        public final static int AT_MIPS_clone_origin = 0x200a;
        public final static int AT_MIPS_has_inlines = 0x200b;
        public final static int AT_MIPS_stride_byte = 0x200c;
        public final static int AT_MIPS_stride_elem = 0x200d;
        public final static int AT_MIPS_ptr_dopetype = 0x200e;
        public final static int AT_MIPS_allocatable_dopetype = 0x200f;
        public final static int AT_MIPS_assumed_shape_dopetype = 0x2010;

        // This one appears to have only been implemented by Open64 for
        // fortran and may conflict with other extensions.
        public final static int AT_MIPS_assumed_size = 0x2011;

        // GNU extensions
        public final static int AT_sf_names = 0x2101;
        public final static int AT_src_info = 0x2102;
        public final static int AT_mac_info = 0x2103;
        public final static int AT_src_coords = 0x2104;
        public final static int AT_body_begin = 0x2105;
        public final static int AT_body_end = 0x2106;
        public final static int AT_GNU_vector = 0x2107;
        public final static int AT_GNU_template_name = 0x2110;

        public final static int AT_GNU_odr_signature = 0x210f;

        // Extensions for Fission proposal.
        public final static int AT_GNU_dwo_name = 0x2130;
        public final static int AT_GNU_dwo_id = 0x2131;
        public final static int AT_GNU_ranges_base = 0x2132;
        public final static int AT_GNU_addr_base = 0x2133;
        public final static int AT_GNU_pubnames = 0x2134;
        public final static int AT_GNU_pubtypes = 0x2135;

        // Apple extensions.
        public final static int AT_APPLE_optimized = 0x3fe1;
        public final static int AT_APPLE_flags = 0x3fe2;
        public final static int AT_APPLE_isa = 0x3fe3;
        public final static int AT_APPLE_block = 0x3fe4;
        public final static int AT_APPLE_major_runtime_vers = 0x3fe5;
        public final static int AT_APPLE_runtime_class = 0x3fe6;
        public final static int AT_APPLE_omit_frame_ptr = 0x3fe7;
        public final static int AT_APPLE_property_name = 0x3fe8;
        public final static int AT_APPLE_property_getter = 0x3fe9;
        public final static int AT_APPLE_property_setter = 0x3fea;
        public final static int AT_APPLE_property_attribute = 0x3feb;
        public final static int AT_APPLE_objc_complete_type = 0x3fec;
        public final static int AT_APPLE_property = 0x3fed;
    }

    public static class Form {
        // Attribute form encodings
        public final static int FORM_addr = 0x01;
        public final static int FORM_block2 = 0x03;
        public final static int FORM_block4 = 0x04;
        public final static int FORM_data2 = 0x05;
        public final static int FORM_data4 = 0x06;
        public final static int FORM_data8 = 0x07;
        public final static int FORM_string = 0x08;
        public final static int FORM_block = 0x09;
        public final static int FORM_block1 = 0x0a;
        public final static int FORM_data1 = 0x0b;
        public final static int FORM_flag = 0x0c;
        public final static int FORM_sdata = 0x0d;
        public final static int FORM_strp = 0x0e;
        public final static int FORM_udata = 0x0f;
        public final static int FORM_ref_addr = 0x10;
        public final static int FORM_ref1 = 0x11;
        public final static int FORM_ref2 = 0x12;
        public final static int FORM_ref4 = 0x13;
        public final static int FORM_ref8 = 0x14;
        public final static int FORM_ref_udata = 0x15;
        public final static int FORM_indirect = 0x16;
        public final static int FORM_sec_offset = 0x17;
        public final static int FORM_exprloc = 0x18;
        public final static int FORM_flag_present = 0x19;
        public final static int FORM_ref_sig8 = 0x20;

        // Extensions for Fission proposal
        public final static int FORM_GNU_addr_index = 0x1f01;
        public final static int FORM_GNU_str_index = 0x1f02;
    }


    public static class LocationAtom {
        // Operation encodings
        public final static int OP_addr = 0x03;
        public final static int OP_deref = 0x06;
        public final static int OP_const1u = 0x08;
        public final static int OP_const1s = 0x09;
        public final static int OP_const2u = 0x0a;
        public final static int OP_const2s = 0x0b;
        public final static int OP_const4u = 0x0c;
        public final static int OP_const4s = 0x0d;
        public final static int OP_const8u = 0x0e;
        public final static int OP_const8s = 0x0f;
        public final static int OP_constu = 0x10;
        public final static int OP_consts = 0x11;
        public final static int OP_dup = 0x12;
        public final static int OP_drop = 0x13;
        public final static int OP_over = 0x14;
        public final static int OP_pick = 0x15;
        public final static int OP_swap = 0x16;
        public final static int OP_rot = 0x17;
        public final static int OP_xderef = 0x18;
        public final static int OP_abs = 0x19;
        public final static int OP_and = 0x1a;
        public final static int OP_div = 0x1b;
        public final static int OP_minus = 0x1c;
        public final static int OP_mod = 0x1d;
        public final static int OP_mul = 0x1e;
        public final static int OP_neg = 0x1f;
        public final static int OP_not = 0x20;
        public final static int OP_or = 0x21;
        public final static int OP_plus = 0x22;
        public final static int OP_plus_uconst = 0x23;
        public final static int OP_shl = 0x24;
        public final static int OP_shr = 0x25;
        public final static int OP_shra = 0x26;
        public final static int OP_xor = 0x27;
        public final static int OP_skip = 0x2f;
        public final static int OP_bra = 0x28;
        public final static int OP_eq = 0x29;
        public final static int OP_ge = 0x2a;
        public final static int OP_gt = 0x2b;
        public final static int OP_le = 0x2c;
        public final static int OP_lt = 0x2d;
        public final static int OP_ne = 0x2e;
        public final static int OP_lit0 = 0x30;
        public final static int OP_lit1 = 0x31;
        public final static int OP_lit2 = 0x32;
        public final static int OP_lit3 = 0x33;
        public final static int OP_lit4 = 0x34;
        public final static int OP_lit5 = 0x35;
        public final static int OP_lit6 = 0x36;
        public final static int OP_lit7 = 0x37;
        public final static int OP_lit8 = 0x38;
        public final static int OP_lit9 = 0x39;
        public final static int OP_lit10 = 0x3a;
        public final static int OP_lit11 = 0x3b;
        public final static int OP_lit12 = 0x3c;
        public final static int OP_lit13 = 0x3d;
        public final static int OP_lit14 = 0x3e;
        public final static int OP_lit15 = 0x3f;
        public final static int OP_lit16 = 0x40;
        public final static int OP_lit17 = 0x41;
        public final static int OP_lit18 = 0x42;
        public final static int OP_lit19 = 0x43;
        public final static int OP_lit20 = 0x44;
        public final static int OP_lit21 = 0x45;
        public final static int OP_lit22 = 0x46;
        public final static int OP_lit23 = 0x47;
        public final static int OP_lit24 = 0x48;
        public final static int OP_lit25 = 0x49;
        public final static int OP_lit26 = 0x4a;
        public final static int OP_lit27 = 0x4b;
        public final static int OP_lit28 = 0x4c;
        public final static int OP_lit29 = 0x4d;
        public final static int OP_lit30 = 0x4e;
        public final static int OP_lit31 = 0x4f;
        public final static int OP_reg0 = 0x50;
        public final static int OP_reg1 = 0x51;
        public final static int OP_reg2 = 0x52;
        public final static int OP_reg3 = 0x53;
        public final static int OP_reg4 = 0x54;
        public final static int OP_reg5 = 0x55;
        public final static int OP_reg6 = 0x56;
        public final static int OP_reg7 = 0x57;
        public final static int OP_reg8 = 0x58;
        public final static int OP_reg9 = 0x59;
        public final static int OP_reg10 = 0x5a;
        public final static int OP_reg11 = 0x5b;
        public final static int OP_reg12 = 0x5c;
        public final static int OP_reg13 = 0x5d;
        public final static int OP_reg14 = 0x5e;
        public final static int OP_reg15 = 0x5f;
        public final static int OP_reg16 = 0x60;
        public final static int OP_reg17 = 0x61;
        public final static int OP_reg18 = 0x62;
        public final static int OP_reg19 = 0x63;
        public final static int OP_reg20 = 0x64;
        public final static int OP_reg21 = 0x65;
        public final static int OP_reg22 = 0x66;
        public final static int OP_reg23 = 0x67;
        public final static int OP_reg24 = 0x68;
        public final static int OP_reg25 = 0x69;
        public final static int OP_reg26 = 0x6a;
        public final static int OP_reg27 = 0x6b;
        public final static int OP_reg28 = 0x6c;
        public final static int OP_reg29 = 0x6d;
        public final static int OP_reg30 = 0x6e;
        public final static int OP_reg31 = 0x6f;
        public final static int OP_breg0 = 0x70;
        public final static int OP_breg1 = 0x71;
        public final static int OP_breg2 = 0x72;
        public final static int OP_breg3 = 0x73;
        public final static int OP_breg4 = 0x74;
        public final static int OP_breg5 = 0x75;
        public final static int OP_breg6 = 0x76;
        public final static int OP_breg7 = 0x77;
        public final static int OP_breg8 = 0x78;
        public final static int OP_breg9 = 0x79;
        public final static int OP_breg10 = 0x7a;
        public final static int OP_breg11 = 0x7b;
        public final static int OP_breg12 = 0x7c;
        public final static int OP_breg13 = 0x7d;
        public final static int OP_breg14 = 0x7e;
        public final static int OP_breg15 = 0x7f;
        public final static int OP_breg16 = 0x80;
        public final static int OP_breg17 = 0x81;
        public final static int OP_breg18 = 0x82;
        public final static int OP_breg19 = 0x83;
        public final static int OP_breg20 = 0x84;
        public final static int OP_breg21 = 0x85;
        public final static int OP_breg22 = 0x86;
        public final static int OP_breg23 = 0x87;
        public final static int OP_breg24 = 0x88;
        public final static int OP_breg25 = 0x89;
        public final static int OP_breg26 = 0x8a;
        public final static int OP_breg27 = 0x8b;
        public final static int OP_breg28 = 0x8c;
        public final static int OP_breg29 = 0x8d;
        public final static int OP_breg30 = 0x8e;
        public final static int OP_breg31 = 0x8f;
        public final static int OP_regx = 0x90;
        public final static int OP_fbreg = 0x91;
        public final static int OP_bregx = 0x92;
        public final static int OP_piece = 0x93;
        public final static int OP_deref_size = 0x94;
        public final static int OP_xderef_size = 0x95;
        public final static int OP_nop = 0x96;
        public final static int OP_push_object_address = 0x97;
        public final static int OP_call2 = 0x98;
        public final static int OP_call4 = 0x99;
        public final static int OP_call_ref = 0x9a;
        public final static int OP_form_tls_address = 0x9b;
        public final static int OP_call_frame_cfa = 0x9c;
        public final static int OP_bit_piece = 0x9d;
        public final static int OP_implicit_value = 0x9e;
        public final static int OP_stack_value = 0x9f;
        public final static int OP_lo_user = 0xe0;
        public final static int OP_hi_user = 0xff;

        // Extensions for GNU-style thread-local storage.
        public final static int OP_GNU_push_tls_address = 0xe0;

        // Extensions for Fission proposal.
        public final static int OP_GNU_addr_index = 0xfb;
        public final static int OP_GNU_const_index = 0xfc;
    }

    public static class TypeKind {
        // Encoding attribute values
        public final static int ATE_address = 0x01;
        public final static int ATE_boolean = 0x02;
        public final static int ATE_complex_float = 0x03;
        public final static int ATE_float = 0x04;
        public final static int ATE_signed = 0x05;
        public final static int ATE_signed_char = 0x06;
        public final static int ATE_unsigned = 0x07;
        public final static int ATE_unsigned_char = 0x08;
        public final static int ATE_imaginary_float = 0x09;
        public final static int ATE_packed_decimal = 0x0a;
        public final static int ATE_numeric_string = 0x0b;
        public final static int ATE_edited = 0x0c;
        public final static int ATE_signed_fixed = 0x0d;
        public final static int ATE_unsigned_fixed = 0x0e;
        public final static int ATE_decimal_float = 0x0f;
        public final static int ATE_UTF = 0x10;
        public final static int ATE_lo_user = 0x80;
        public final static int ATE_hi_user = 0xff;
    }

    public static class DecimalSignEncoding {
        // Decimal sign attribute values
        public final static int DS_unsigned = 0x01;
        public final static int DS_leading_overpunch = 0x02;
        public final static int DS_trailing_overpunch = 0x03;
        public final static int DS_leading_separate = 0x04;
        public final static int DS_trailing_separate = 0x05;
    }

    public static class EndianityEncoding {
        // Endianity attribute values
        public final static int END_default = 0x00;
        public final static int END_big = 0x01;
        public final static int END_little = 0x02;
        public final static int END_lo_user = 0x40;
        public final static int END_hi_user = 0xff;
    }

    public static class AccessAttribute {
        // Accessibility codes
        public final static int ACCESS_public = 0x01;
        public final static int ACCESS_protected = 0x02;
        public final static int ACCESS_private = 0x03;
    }

    public static class VisibilityAttribute {
        // Visibility codes
        public final static int VIS_local = 0x01;
        public final static int VIS_exported = 0x02;
        public final static int VIS_qualified = 0x03;
    }

    public static class VirtualityAttribute {
        // Virtuality codes
        public final static int VIRTUALITY_none = 0x00;
        public final static int VIRTUALITY_virtual = 0x01;
        public final static int VIRTUALITY_pure_virtual = 0x02;
    }

    public static class SourceLanguage {
        // Language names
        public final static int LANG_C89 = 0x0001;
        public final static int LANG_C = 0x0002;
        public final static int LANG_Ada83 = 0x0003;
        public final static int LANG_C_plus_plus = 0x0004;
        public final static int LANG_Cobol74 = 0x0005;
        public final static int LANG_Cobol85 = 0x0006;
        public final static int LANG_Fortran77 = 0x0007;
        public final static int LANG_Fortran90 = 0x0008;
        public final static int LANG_Pascal83 = 0x0009;
        public final static int LANG_Modula2 = 0x000a;
        public final static int LANG_Java = 0x000b;
        public final static int LANG_C99 = 0x000c;
        public final static int LANG_Ada95 = 0x000d;
        public final static int LANG_Fortran95 = 0x000e;
        public final static int LANG_PLI = 0x000f;
        public final static int LANG_ObjC = 0x0010;
        public final static int LANG_ObjC_plus_plus = 0x0011;
        public final static int LANG_UPC = 0x0012;
        public final static int LANG_D = 0x0013;
        // New in DWARF 5:
        public final static int LANG_Python = 0x0014;
        public final static int LANG_OpenCL = 0x0015;
        public final static int LANG_Go = 0x0016;
        public final static int LANG_Modula3 = 0x0017;
        public final static int LANG_Haskell = 0x0018;
        public final static int LANG_C_plus_plus_03 = 0x0019;
        public final static int LANG_C_plus_plus_11 = 0x001a;
        public final static int LANG_OCaml = 0x001b;

        public final static int LANG_lo_user = 0x8000;
        public final static int LANG_Mips_Assembler = 0x8001;
        public final static int LANG_hi_user = 0xffff;
    }

    public static class CaseSensitivity {
        // Identifier case codes
        public final static int ID_case_sensitive = 0x00;
        public final static int ID_up_case = 0x01;
        public final static int ID_down_case = 0x02;
        public final static int ID_case_insensitive = 0x03;
    }

    public static class CallingConvention {
        // Calling convention codes
        public final static int CC_normal = 0x01;
        public final static int CC_program = 0x02;
        public final static int CC_nocall = 0x03;
        public final static int CC_lo_user = 0x40;
        public final static int CC_hi_user = 0xff;
    }

    public static class InlineAttribute {
        // Inline codes
        public final static int INL_not_inlined = 0x00;
        public final static int INL_inlined = 0x01;
        public final static int INL_declared_not_inlined = 0x02;
        public final static int INL_declared_inlined = 0x03;
    }

    public static class ArrayDimensionOrdering {
        // Array ordering
        public final static int ORD_row_major = 0x00;
        public final static int ORD_col_major = 0x01;
    }

    public static class DiscriminantList {
        // Discriminant descriptor values
        public final static int DSC_label = 0x00;
        public final static int DSC_range = 0x01;
    }

    public static class LineNumberOps {
        // Line Number Standard Opcode Encodings
        public final static int LNS_extended_op = 0x00;
        public final static int LNS_copy = 0x01;
        public final static int LNS_advance_pc = 0x02;
        public final static int LNS_advance_line = 0x03;
        public final static int LNS_set_file = 0x04;
        public final static int LNS_set_column = 0x05;
        public final static int LNS_negate_stmt = 0x06;
        public final static int LNS_set_basic_block = 0x07;
        public final static int LNS_const_add_pc = 0x08;
        public final static int LNS_fixed_advance_pc = 0x09;
        public final static int LNS_set_prologue_end = 0x0a;
        public final static int LNS_set_epilogue_begin = 0x0b;
        public final static int LNS_set_isa = 0x0c;
    }

    public static class LineNumberExtendedOps {
        // Line Number Extended Opcode Encodings
        public final static int LNE_end_sequence = 0x01;
        public final static int LNE_set_address = 0x02;
        public final static int LNE_define_file = 0x03;
        public final static int LNE_set_discriminator = 0x04;
        public final static int LNE_lo_user = 0x80;
        public final static int LNE_hi_user = 0xff;
    }

    public static class MacinfoRecordType {
        // Macinfo Type Encodings
        public final static int MACINFO_define = 0x01;
        public final static int MACINFO_undef = 0x02;
        public final static int MACINFO_start_file = 0x03;
        public final static int MACINFO_end_file = 0x04;
        public final static int MACINFO_vendor_ext = 0xff;
    }

    public static class CallFrameInfo {
        // Call frame instruction encodings
        public final static int CFA_extended = 0x00;
        public final static int CFA_nop = 0x00;
        public final static int CFA_advance_loc = 0x40;
        public final static int CFA_offset = 0x80;
        public final static int CFA_restore = 0xc0;
        public final static int CFA_set_loc = 0x01;
        public final static int CFA_advance_loc1 = 0x02;
        public final static int CFA_advance_loc2 = 0x03;
        public final static int CFA_advance_loc4 = 0x04;
        public final static int CFA_offset_extended = 0x05;
        public final static int CFA_restore_extended = 0x06;
        public final static int CFA_undefined = 0x07;
        public final static int CFA_same_value = 0x08;
        public final static int CFA_register = 0x09;
        public final static int CFA_remember_state = 0x0a;
        public final static int CFA_restore_state = 0x0b;
        public final static int CFA_def_cfa = 0x0c;
        public final static int CFA_def_cfa_register = 0x0d;
        public final static int CFA_def_cfa_offset = 0x0e;
        public final static int CFA_def_cfa_expression = 0x0f;
        public final static int CFA_expression = 0x10;
        public final static int CFA_offset_extended_sf = 0x11;
        public final static int CFA_def_cfa_sf = 0x12;
        public final static int CFA_def_cfa_offset_sf = 0x13;
        public final static int CFA_val_offset = 0x14;
        public final static int CFA_val_offset_sf = 0x15;
        public final static int CFA_val_expression = 0x16;
        public final static int CFA_MIPS_advance_loc8 = 0x1d;
        public final static int CFA_GNU_window_save = 0x2d;
        public final static int CFA_GNU_args_size = 0x2e;
        public final static int CFA_lo_user = 0x1c;
        public final static int CFA_hi_user = 0x3f;
    }

    public static class Constants {
        // Children flag
        public final static int CHILDREN_no = 0x00;
        public final static int CHILDREN_yes = 0x01;

        public final static int EH_PE_absptr = 0x00;
        public final static int EH_PE_omit = 0xff;
        public final static int EH_PE_uleb128 = 0x01;
        public final static int EH_PE_udata2 = 0x02;
        public final static int EH_PE_udata4 = 0x03;
        public final static int EH_PE_udata8 = 0x04;
        public final static int EH_PE_sleb128 = 0x09;
        public final static int EH_PE_sdata2 = 0x0A;
        public final static int EH_PE_sdata4 = 0x0B;
        public final static int EH_PE_sdata8 = 0x0C;
        public final static int EH_PE_signed = 0x08;
        public final static int EH_PE_pcrel = 0x10;
        public final static int EH_PE_textrel = 0x20;
        public final static int EH_PE_datarel = 0x30;
        public final static int EH_PE_funcrel = 0x40;
        public final static int EH_PE_aligned = 0x50;
        public final static int EH_PE_indirect = 0x80;
    }

    // Constants for debug_loc.dwo in the DWARF5 Split Debug Info Proposal
    public static class LocationListEntry {
        public final static int LLE_end_of_list_entry = 0;
        public final static int LLE_base_address_selection_entry = 1;
        public final static int LLE_start_end_entry = 2;
        public final static int LLE_start_length_entry = 3;
        public final static int LLE_offset_pair_entry = 4;
    }

    /// Contstants for the public final static int APPLE_PROPERTY_attributes attribute.
    /// Keep this list in sync with clang's DeclSpec.h ObjCPropertyAttributeKind.
    public static class ApplePropertyAttributes {
        // Apple Objective-C Property Attributes
        public final static int APPLE_PROPERTY_readonly = 0x01;
        public final static int APPLE_PROPERTY_getter = 0x02;
        public final static int APPLE_PROPERTY_assign = 0x04;
        public final static int APPLE_PROPERTY_readwrite = 0x08;
        public final static int APPLE_PROPERTY_retain = 0x10;
        public final static int APPLE_PROPERTY_copy = 0x20;
        public final static int APPLE_PROPERTY_nonatomic = 0x40;
        public final static int APPLE_PROPERTY_setter = 0x80;
        public final static int APPLE_PROPERTY_atomic = 0x100;
        public final static int APPLE_PROPERTY_weak = 0x200;
        public final static int APPLE_PROPERTY_strong = 0x400;
        public final static int APPLE_PROPERTY_unsafe_unretained = 0x800;
    }

    // Constants for the DWARF5 Accelerator Table Proposal
    public static class AcceleratorTable {
        // Data layout descriptors.
        public final static int ATOM_null = 0;       // Marker as the end of a list of atoms.
        public final static int ATOM_die_offset = 1; // DIE offset in the debug_info section.
        public final static int ATOM_cu_offset = 2; // Offset of the compile unit header that contains the
        // item in question.
        public final static int ATOM_die_tag = 3;   // A tag entry.
        public final static int ATOM_type_flags = 4; // Set of flags for a type.

        // public final static int ATOM_type_flags values.

        // Always set for C++; only set for ObjC if this is the @implementation for a
        // class.
        public final static int FLAG_type_implementation = 2;

        // Hash functions.

        // Daniel J. Bernstein hash.
        public final static int hash_function_djb = 0;
    }
}

if(APPLE)
	project(frameworks)

	include_directories(../../core/include)

	set(SRC
	  frameworksupport.m
	)

	add_library(robovm-frameworksupport STATIC ${SRC})

	set_target_properties(robovm-frameworksupport PROPERTIES SUFFIX "${LIB_SUFFIX}")
	install(TARGETS robovm-frameworksupport DESTINATION ${INSTALL_DIR})
endif()

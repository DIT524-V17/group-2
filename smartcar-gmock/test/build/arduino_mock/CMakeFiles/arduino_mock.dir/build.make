# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.5

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build

# Utility rule file for arduino_mock.

# Include the progress variables for this target.
include arduino_mock/CMakeFiles/arduino_mock.dir/progress.make

arduino_mock/CMakeFiles/arduino_mock: arduino_mock/CMakeFiles/arduino_mock-complete


arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-install
arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-mkdir
arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-download
arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-update
arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-patch
arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-configure
arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-build
arduino_mock/CMakeFiles/arduino_mock-complete: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-install
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Completed 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E make_directory /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/CMakeFiles
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/CMakeFiles/arduino_mock-complete
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-done

arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-install: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-build
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "No install step for 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-build && /usr/bin/cmake -E echo_append
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-build && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-install

arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-mkdir:
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Creating directories for 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E make_directory /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E make_directory /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-build
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E make_directory /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E make_directory /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/tmp
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E make_directory /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E make_directory /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-mkdir

arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-download: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-urlinfo.txt
arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-download: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-mkdir
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Performing download step (download, verify and extract) for 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src && /usr/bin/cmake -P /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/download-arduino_mock.cmake
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src && /usr/bin/cmake -P /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/verify-arduino_mock.cmake
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src && /usr/bin/cmake -P /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/extract-arduino_mock.cmake
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-download

arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-update: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-download
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "No update step for 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E echo_append
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-update

arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-patch: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-download
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "No patch step for 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E echo_append
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-patch

arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-configure: arduino_mock/arduino_mock/tmp/arduino_mock-cfgcmd.txt
arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-configure: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-update
arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-configure: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-patch
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_7) "Performing configure step for 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-build && /usr/bin/cmake "-GUnix Makefiles" /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-build && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-configure

arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-build: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-configure
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_8) "Performing build step for 'arduino_mock'"
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-build && $(MAKE)
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-build && /usr/bin/cmake -E touch /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-build

arduino_mock: arduino_mock/CMakeFiles/arduino_mock
arduino_mock: arduino_mock/CMakeFiles/arduino_mock-complete
arduino_mock: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-install
arduino_mock: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-mkdir
arduino_mock: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-download
arduino_mock: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-update
arduino_mock: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-patch
arduino_mock: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-configure
arduino_mock: arduino_mock/arduino_mock/src/arduino_mock-stamp/arduino_mock-build
arduino_mock: arduino_mock/CMakeFiles/arduino_mock.dir/build.make

.PHONY : arduino_mock

# Rule to build all files generated by this target.
arduino_mock/CMakeFiles/arduino_mock.dir/build: arduino_mock

.PHONY : arduino_mock/CMakeFiles/arduino_mock.dir/build

arduino_mock/CMakeFiles/arduino_mock.dir/clean:
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock && $(CMAKE_COMMAND) -P CMakeFiles/arduino_mock.dir/cmake_clean.cmake
.PHONY : arduino_mock/CMakeFiles/arduino_mock.dir/clean

arduino_mock/CMakeFiles/arduino_mock.dir/depend:
	cd /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/arduino_mock /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock /home/jeberlen/School/project2/testenviroment/smartcar-gmock/test/build/arduino_mock/CMakeFiles/arduino_mock.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : arduino_mock/CMakeFiles/arduino_mock.dir/depend


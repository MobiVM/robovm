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

package org.robovm.compiler.config;

import java.util.ArrayList;

import org.robovm.compiler.util.AntPathMatcher;

public class StripArchivesConfig {

	private final ArrayList<Pattern> patterns;
	private static final Pattern EXCLUDE_CLASS_FILES = new Pattern("**/*.class", false);
	private static final Pattern INCLUDE_ALL = new Pattern("**/*", true);
	public static final StripArchivesConfig DEFAULT = new StripArchivesBuilder().build();

	public StripArchivesConfig (ArrayList<Pattern> patterns) {
		this.patterns = patterns;
	}

	public ArrayList<Pattern> getPatterns () {
		return patterns;
	}

	public static class StripArchivesBuilder {
		private ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		private boolean hasBeenUsed;

		public void add (boolean include, String... patterns) {
			if (hasBeenUsed) {
				throw new IllegalStateException("This builder has already been used and can't be reused.");
			}
			for (String pattern : patterns) {
				this.patterns.add(new Pattern(pattern, include));
			}
		}

		public void addInclude (String... patterns) {
			add(true, patterns);
		}

		public void addExclude (String... patterns) {
			add(false, patterns);
		}

		public StripArchivesConfig build () {
			patterns.add(EXCLUDE_CLASS_FILES);
			patterns.add(INCLUDE_ALL);
			hasBeenUsed = true;
			return new StripArchivesConfig(patterns);
		}
	}

	public static class Pattern {

		private AntPathMatcher matcher;
		private final boolean isInclude;
		private final String pattern;

		public Pattern (String pattern, boolean isInclude) {
			this.matcher = new AntPathMatcher(pattern);
			this.isInclude = isInclude;
			this.pattern = pattern;
		}

		public boolean matches (String path) {
			return matcher.matches(path);
		}

		public boolean isInclude () {
			return isInclude;
		}

		public String getPatternAsString () {
			return pattern;
		}

	}
}

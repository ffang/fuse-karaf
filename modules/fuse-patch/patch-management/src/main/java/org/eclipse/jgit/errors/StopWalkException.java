/**
 *  Copyright 2005-2017 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.eclipse.jgit.errors;

/**
 * Stops the driver loop of walker and finish with current results.
 *
 * @see org.eclipse.jgit.revwalk.filter.RevFilter
 */
public class StopWalkException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/** Singleton instance for throwing within a filter. */
	public static final StopWalkException INSTANCE = new StopWalkException();

	private StopWalkException() {
		super(null, null, false, false);
	}
}
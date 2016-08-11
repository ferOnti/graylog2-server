/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog2.indexer.indices;

import java.util.Set;

public class TooManyAliasesException extends Exception {
    private final Set<String> indices;

    public TooManyAliasesException(final Set<String> indices) {
        super("More than one index in deflector alias: " + indices.toString());
        this.indices = indices;
    }

    public Set<String> getIndices() {
        return indices;
    }
}
/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.universalis.worlds;

import java.util.Collections;
import java.util.List;

public interface World extends WorldProvider {

    /**
     * Creates a new world based on a name and an id
     *
     * @param name world name
     * @param id   world id
     * @return new world instance
     */
    static World of(String name, int id) {
        return new World() {
            @Override
            public String name() {
                return name;
            }

            @Override
            public int id() {
                return id;
            }

            @Override
            public List<World> worlds() {
                return Collections.singletonList(this);
            }

            @Override
            public boolean equals(Object obj) {
                if (!(obj instanceof World world)) return false;
                return id == world.id();
            }

            @Override
            public String toString() {
                return "%s (%d)".formatted(name, id);
            }
        };
    }

    String name();

    int id();
}

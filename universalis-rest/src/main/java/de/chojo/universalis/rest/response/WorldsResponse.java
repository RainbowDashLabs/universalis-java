/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.universalis.rest.response;

import de.chojo.universalis.worlds.World;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public record WorldsResponse(List<World> worlds) implements Iterable<World> {
    @NotNull
    @Override
    public Iterator<World> iterator() {
        return worlds.iterator();
    }
}

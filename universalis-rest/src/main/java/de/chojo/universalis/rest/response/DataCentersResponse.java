/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.universalis.rest.response;

import de.chojo.universalis.entities.DataCenter;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public record DataCentersResponse(List<DataCenter> dataCenters) implements Iterable<DataCenter> {

    @NotNull
    @Override
    public Iterator<DataCenter> iterator() {
        return dataCenters.iterator();
    }
}

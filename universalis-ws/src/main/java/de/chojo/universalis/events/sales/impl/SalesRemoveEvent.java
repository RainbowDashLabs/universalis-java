/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.universalis.events.sales.impl;

import de.chojo.universalis.entities.Sale;
import de.chojo.universalis.entities.Item;
import de.chojo.universalis.entities.World;
import de.chojo.universalis.events.sales.SalesEvent;

import java.util.List;

/**
 * Represents removal of sales entries.
 *
 * @deprecated Sales do not get removed anymore.
 */
@Deprecated
public class SalesRemoveEvent extends SalesEvent {
    public SalesRemoveEvent(World world, Item item, List<Sale> sales) {
        super(world, item, sales);
    }
}

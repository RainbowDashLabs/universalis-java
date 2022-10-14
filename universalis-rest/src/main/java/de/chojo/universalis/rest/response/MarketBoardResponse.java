/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.universalis.rest.response;

import de.chojo.universalis.entities.Item;
import de.chojo.universalis.entities.Listing;
import de.chojo.universalis.entities.QualityIndicator;
import de.chojo.universalis.entities.Sale;
import de.chojo.universalis.worlds.World;
import de.chojo.universalis.worlds.DataCenter;
import de.chojo.universalis.worlds.Region;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public record MarketBoardResponse(Item item,
                                  @Nullable World world,
                                  @Nullable DataCenter dataCenter,
                                  @Nullable Region region,
                                  Instant lastUploadTime,
                                  List<Listing> listings,
                                  List<Sale> recentHistory,
                                  QualityIndicator<Float> currentAveragePrice,
                                  QualityIndicator<Float> saleVelocity,
                                  QualityIndicator<Float> averagePrice,
                                  QualityIndicator<Integer> minPrice,
                                  QualityIndicator<Integer> maxPrice,
                                  QualityIndicator<Map<Integer, Integer>> stackSizeHistogram,
                                  @Nullable Map<World, Instant> worldUploadTimes
) {
}

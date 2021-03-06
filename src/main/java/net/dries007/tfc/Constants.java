/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class Constants
{
    public static final String MOD_ID = "tfc";
    public static final String MOD_NAME = "TerraFirmaCraft";
    public static final String GUI_FACTORY = "net.dries007.tfc.client.TFCModGuiFactory";
    public static final String SIGNING_KEY = "ee4505933cd28f4b09a0bc91007935f61e7d786e";
    public static final String TREEPATH = "/assets/tfc/schematics/trees/";
    public static final Gson GSON = new GsonBuilder().disableHtmlEscaping().create();
    public static final Gson GSON_PP = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
}

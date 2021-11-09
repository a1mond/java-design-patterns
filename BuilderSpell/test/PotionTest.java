import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PotionTest {
    @Test
    public void test() {
        Potion potion1 = new Potion.PotionBuilder("A Juice of Animal form", "water")
                .addIngredient("Charm of Demonic Pacts")
                .addIngredient("Molten Blast")
                .addIngredient("Spirit Storm")
                .enhanced(true)
                .explosive(false)
                .build();

        Potion potion2 = new Potion.PotionBuilder("Thunder Rage", "Space Substance")
                .addIngredient("Soulsteal")
                .build();

        Assert.assertEquals("A Juice of Animal form", potion1.getName());
        Assert.assertArrayEquals(List.of("Charm of Demonic Pacts", "Molten Blast","Spirit Storm").toArray(), potion1.getIngredients().toArray());
        Assert.assertTrue(potion1.isEnhanced());
        Assert.assertFalse(potion1.isExplosive());

        Assert.assertEquals("Thunder Rage", potion2.getName());
        Assert.assertArrayEquals(List.of("Soulsteal").toArray(), potion2.getIngredients().toArray());
        Assert.assertFalse(potion2.isEnhanced());
        Assert.assertFalse(potion2.isExplosive());
    }
}


package mage.game.command.emblems;

import mage.abilities.Ability;
import mage.abilities.common.BeginningOfEndStepTriggeredAbility;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.game.command.Emblem;
import mage.game.permanent.token.KioraKrakenToken;

/**
 *
 * @author spjspj
 */
public class KioraEmblem extends Emblem {

    /**
     * Emblem: "At the beginning of your end step, create a 9/9 blue Kraken
     * creature token."
     */

    public KioraEmblem() {
        this.setName("Emblem Kiora");
        Ability ability = new BeginningOfEndStepTriggeredAbility(Zone.COMMAND, new CreateTokenEffect(new KioraKrakenToken()), TargetController.YOU, null, false);
        this.getAbilities().add(ability);
    }
}

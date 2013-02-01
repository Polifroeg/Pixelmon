package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;

import net.minecraft.util.DamageSource;
import pixelmon.battles.attacks.Attack;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class JumpKick extends SpecialAttackBase {

	public JumpKick() {
		super(SpecialAttackType.JumpKick, ApplyStage.During, false);
	}

	@Override
	public boolean ApplyEffect(EntityPixelmon user, EntityPixelmon target, Attack a, ArrayList<String> attackList, ArrayList<String> targetAttackList) {
		return false;
	}

	@Override
	public void ApplyMissEffect(EntityPixelmon user, EntityPixelmon target) throws Exception {
		user.attackEntityFrom(DamageSource.causeMobDamage(user), user.getHealth() / 2);
		ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), user.getName() + " kept on going and hurt itself trying to land!");
	}
}
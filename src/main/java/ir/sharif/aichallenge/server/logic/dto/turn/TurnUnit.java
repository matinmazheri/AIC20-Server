package ir.sharif.aichallenge.server.logic.dto.turn;


import ir.sharif.aichallenge.server.logic.dto.ClientCell;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnUnit {
    private int unitId;
    private int playerId;
    private int typeId;
    private int pathId;     // valid for player and his friend
    private ClientCell cell;
    private int hp;
    private int damageLevel;
    private int rangeLevel;
    private boolean wasDamageUpgraded;
    private boolean wasRangeUpgraded;
    private boolean isHasted;
    private boolean isClone;
    private int activePoisons;
    private int range;
    private int attack;
    private boolean wasPlayedThisTurn;
    private int target;
}

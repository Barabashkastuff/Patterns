package structural.adapter.adapter;

import structural.adapter.character.Character;

/**
 * UpdateCharacterHealth Interface
 *
 * @author a.slepakurov
 * @version 8/11/2015
 */
public interface IUpdateCharacterHealth {
    void updateHealth(Character character, int updateBy);
}

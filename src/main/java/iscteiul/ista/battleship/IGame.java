/**
 *
 */
package iscteiul.ista.battleship;

import java.util.List;

/**
 * Interface que define o comportamento principal de um jogo Batalha Naval.
 */

public interface IGame {
    IShip fire(IPosition pos);

    List<IPosition> getShots();

    int getRepeatedShots();

    int getInvalidShots();

    int getHits();

    int getSunkShips();

    int getRemainingShips();

    void printValidShots();

    void printFleet();
}

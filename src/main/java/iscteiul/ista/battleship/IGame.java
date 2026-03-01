/**
 *
 */
package iscteiul.ista.battleship;

import java.util.List;

/**
 * Interface que define as operações principais
 * de controlo de um jogo Battleship.
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

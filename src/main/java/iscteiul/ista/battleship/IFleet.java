/**
 *
 */
package iscteiul.ista.battleship;

import java.util.List;

/**
 * Interface que define o comportamento esperado
 * de uma frota de navios.
 */


public interface IFleet {
    Integer BOARD_SIZE = 10;
    Integer FLEET_SIZE = 10;

    List<IShip> getShips();

    boolean addShip(IShip s);

    List<IShip> getShipsLike(String category);

    List<IShip> getFloatingShips();

    IShip shipAt(IPosition pos);

    void printStatus();
}

package inventoryMS;

import java.util.List;

public class WarehouseController {
	List<Warehouse> listWarehouse;
	WarehouseSelectionStrategy warehouseSelectionStrategy=null;
	public WarehouseController(List<Warehouse> listWarehouse, WarehouseSelectionStrategy warehouseSelectionStrategy) {
		this.listWarehouse = listWarehouse;
		this.warehouseSelectionStrategy = warehouseSelectionStrategy;
	}
	public void addNewWarehouse(Warehouse warehouse){
        listWarehouse.add(warehouse);
    }

    //remove warehouse
    public void removeWarehouse(Warehouse warehouse){
        listWarehouse.remove(warehouse);
    }

    public Warehouse selectWarehouse(WarehouseSelectionStrategy selectionStrategy){
        this.warehouseSelectionStrategy = selectionStrategy;
        return warehouseSelectionStrategy.selectWarehouse(listWarehouse);
    }

	
}

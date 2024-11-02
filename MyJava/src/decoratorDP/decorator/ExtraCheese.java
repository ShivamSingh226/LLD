package decoratorDP.decorator;

import decoratorDP.base.BasePizza;

public class ExtraCheese extends ToppingDecorator {
	BasePizza basepizza;
	public ExtraCheese(BasePizza basePizza) {
		this.basepizza=basePizza;
	}
	@Override
	public int cost() {
		return this.basepizza.cost()+10;
	}
}

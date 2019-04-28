package com.maxicorrea.effectivejava.methods_common_to_all_objects.equals;

import java.awt.Color;
import java.awt.Point;

/**
 * 
 * El metodo de equals y sus propiedades son complejas de implementar
 * sin cometer errores. Una muy buena solucion es utilizar la composicion.
 * 
 * @author maximiliano
 *
 */
public class Composition {
	
	public static class ColorPoint {

		private final Color color;
		private final Point point;

		private ColorPoint(
				final Color color, 
				final Point point) {
			this.color = color;
			this.point = point;
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof ColorPoint))
				return false;
			ColorPoint cp = (ColorPoint) o;
			return point.equals(cp.point) && 
				   color.equals(cp.color);
		}

	}
}

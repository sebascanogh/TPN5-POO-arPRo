package paqueteTPN5;

public class ClasePrincipalTPN5 {

	public static void main(String[] args) {

		//instanciar a la clase Producto


		Producto p1 = new Producto(100,"Dulce de leche","Repostero x 500grs.",450.30,1000);

		Producto p2 = new Producto(101,"Leche","En polvo x 500grs.",200,1000);

		Producto p3 = new Producto(102,"Pan","Casero x 500grs.",150.30,500);

		Producto p4 = new Producto(103,"Café","Frasco x 500grs.",450.30,1000);

		
		
		System.out.println("Codigo: "+p1.un_codigo()+" Nombre: "+p1.un_nombre()+" Precio: "+p1.un_precio());

		System.out.println("Codigo: "+p2.un_codigo()+" Nombre: "+p2.un_nombre()+" Precio: "+p2.un_precio());

		System.out.println("Codigo: "+p3.un_codigo()+" Nombre: "+p3.un_nombre()+" Precio: "+p3.un_precio());

		System.out.println("Codigo: "+p4.un_codigo()+" Nombre: "+p4.un_nombre()+" Precio: "+p4.un_precio());

		
		Cliente c1 = new Cliente(101, 41645480, "Cano Sebastian", "Las Heras 617");
		Carrito carro = new Carrito(25,c1);
		
		Item_Carrito itemC[] = new Item_Carrito[3];
		
		
		itemC[0] = new Item_Carrito(carro, p1, 2);
		itemC[1] = new Item_Carrito(carro, p2, 5);
		itemC[2] = new Item_Carrito(carro, p3, 1);
		itemC[0].mostrarTitulo();
		mostrarItems(itemC,carro,c1);
	
	}
	
	public static void mostrarItems(Item_Carrito vec[], Carrito carro, Cliente c1) {
		double total = 0.0;
		for (Item_Carrito lista:vec) {
			lista.mostrarItems();
			total = total + lista.damemontoItem();
		}
		carro.mostrarMontoTotal(total);
		
	}

		
	}



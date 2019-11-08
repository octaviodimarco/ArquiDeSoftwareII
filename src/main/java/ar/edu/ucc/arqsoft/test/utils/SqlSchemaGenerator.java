package ar.edu.ucc.arqsoft.test.utils;

import java.util.EnumSet;
import java.util.Properties;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.hbm2ddl.SchemaExport.Action;
import org.hibernate.tool.schema.TargetType;

import ar.edu.ucc.arqsoft.test.model.ObjetoGenerico;
import ar.edu.ucc.arqsoft.test.model.Operacion;
import ar.edu.ucc.arqsoft.test.model.Tarjeta;
import ar.edu.ucc.arqsoft.test.model.Transaccion;
import ar.edu.ucc.arqsoft.test.model.Usuario;

public class SqlSchemaGenerator {

	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.put("hibernate.show_sql", "true");

		MetadataSources metadata = new MetadataSources(
				new StandardServiceRegistryBuilder().applySettings(properties).build());
		
		// AGREGAR ACA SUS CLASES NUEVAS
		metadata.addAnnotatedClass(ObjetoGenerico.class);
		metadata.addAnnotatedClass(Transaccion.class);
		metadata.addAnnotatedClass(Operacion.class);
		metadata.addAnnotatedClass(Tarjeta.class);
		metadata.addAnnotatedClass(Usuario.class);
	
		// Agregar las Clases
		SchemaExport schemaExport = new SchemaExport();
		schemaExport.setDelimiter(";");

		schemaExport.setOutputFile("src/main/resources/Schema.sql");
		schemaExport.setFormat(true);
		schemaExport.execute(EnumSet.of(TargetType.SCRIPT), Action.BOTH, metadata.buildMetadata());
	}
}

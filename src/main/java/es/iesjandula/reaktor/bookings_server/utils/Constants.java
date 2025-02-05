package es.iesjandula.reaktor.bookings_server.utils;

public class Constants
{
	/*********************************************************/
	/*********************** Errores *************************/
	/*********************************************************/

	public final static int STD_CODE_ERROR = 500;

	/*********************************************************/
	/**************** Código de error propio *****************/
	/*********************************************************/

	// Recursos
	public final static int RECURSO_NO_ENCONTRADO = 1;
	public final static int RECURSO_YA_EXISTE = 2;
	public final static int RECURSO_ELIMINADO_CORRECTAMENTE = 3;
	public final static int ERROR_CREANDO_RECURSO = 4;
	public final static int ERROR_OBTENIENDO_RECURSOS = 5;
	public final static int ERROR_ELIMINANDO_RECURSO = 6;

	// Códigos de error para las excepciones
	public static final int ERROR_CONNECT_TIMEOUT = 7;
	public static final int ERROR_IO_EXCEPTION = 8;
	public static final int ERROR_SOCKET_TIMEOUT = 9;
	public static final int ERROR_IO_EXCEPTION_CERRANDO_FLUJO = 12;

	// Tramos Horarios
	public final static int TRAMO_HORARIO_NO_ENCONTRADO = 10;
	public final static int ERROR_OBTENIENDO_TRAMOS_HORARIOS = 11;

	// Días de la Semana
	public final static int DIA_SEMANA_NO_ENCONTRADO = 20;
	public final static int ERROR_OBTENIENDO_DIAS_SEMANA = 21;

	// Códigos de error para validaciones globales previas a la reserva fija
	public static final int ERROR_OBTENIENDO_PARAMETROS = 23;
	public static final int ERROR_APP_DESHABILITADA = 24;

	// Reservas
	public final static int RESERVA_NO_ENCONTRADA = 30;
	public final static int RESERVA_YA_EXISTE = 31;
	public final static int RESERVA_CREADA_CORRECTAMENTE = 32;
	public final static int RESERVA_CANCELADA_CORRECTAMENTE = 33;
	public final static int ERROR_CREANDO_RESERVA = 34;
	public final static int ERROR_OBTENIENDO_RESERVAS = 35;
	public final static int ERROR_CANCELANDO_RESERVA = 36;

	// Usuarios/Profesores
	public final static int PROFESOR_NO_ENCONTRADO = 40;
	public final static int ERROR_OBTENIENDO_PROFESOR = 41;

	// Constantes/Configuración
	public final static int CONSTANTE_NO_ENCONTRADA = 50;
	public final static int ERROR_OBTENIENDO_CONSTANTES = 51;
	public final static int APP_DESHABILITADA = 52;

	// Errores Generales/De Conexión
	public final static int ERROR_INESPERADO = 100;
	public final static int ERROR_CONEXION_FIREBASE = 101;
	public final static int TIMEOUT_CONEXION_FIREBASE = 102;
	public final static int IO_EXCEPTION_FIREBASE = 103;

	/*********************************************************/
	/************************ Ficheros ***********************/
	/*********************************************************/

	public static final String FICHERO_RECURSO = "recursos.csv";

	public static final String FICHERO_TRAMOS_HORARIOS = "tramosHorarios.csv";

	public static final String FICHERO_DIAS_SEMANAS = "diasSemana.csv";

	public static final String FICHERO_PROFESORES = "profesor.csv";

	/*********************************************************/
	/****************** Modo DDL - Create ********************/
	/*********************************************************/

	public static final String MODO_DDL_CREATE = "create";

	/*********************************************************/
	/******************** Tabla Constantes *******************/
	/*********************************************************/

	public static final String TABLA_CONST_RESERVAS_FIJAS = "Reservas fijas";

	public static final String TABLA_CONST_RESERVAS_PUNTUALES = "Reservas puntuales";

	/*********************************************************/
	/******************* Parámetros YAML *********************/
	/*********************************************************/

	/** Constante - Parámetros YAML - Reservas fijas */
	public static final String PARAM_YAML_RESERVAS_FIJAS = "reaktor.constantes.reservasFijas";

	/** Constante - Parámetros YAML - Reservas puntuales */
	public static final String PARAM_YAML_RESERVAS_PUNTUALES = "reaktor.constantes.reservasPuntuales";
}

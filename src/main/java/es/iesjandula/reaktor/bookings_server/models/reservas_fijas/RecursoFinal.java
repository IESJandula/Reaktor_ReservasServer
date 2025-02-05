package es.iesjandula.reaktor.bookings_server.models.reservas_fijas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RecursoFinal
{
	@Id
	@Column(length = 30)
	private String id;

	@Column(length = 3)
	private Integer cantidad;
}
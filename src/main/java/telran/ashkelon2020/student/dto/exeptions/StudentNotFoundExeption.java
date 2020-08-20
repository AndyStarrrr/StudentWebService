package telran.ashkelon2020.student.dto.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class StudentNotFoundExeption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StudentNotFoundExeption(int id) {
		super("Student with id " + id + " not found");
	}
}

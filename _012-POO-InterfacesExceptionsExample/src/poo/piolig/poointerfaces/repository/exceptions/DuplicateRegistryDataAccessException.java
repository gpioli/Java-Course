package poo.piolig.poointerfaces.repository.exceptions;

public class DuplicateRegistryDataAccessException extends WriteDataAccessException{

    public DuplicateRegistryDataAccessException(String message) {
        super(message);
    }
}

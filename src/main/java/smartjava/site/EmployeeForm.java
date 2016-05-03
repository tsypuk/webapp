package smartjava.site;

import smartjava.site.validation.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeForm
{
    @NotBlank(message = "{validate.employee.firstName}")
    private String firstName;

    @NotNull(message = "{validate.employee.lastName}")
    @Size(min = 1, message = "{validate.employee.lastName}")
    private String lastName;

    @NotBlank(message = "{validate.employee.middleName}")
    private String middleName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }
}

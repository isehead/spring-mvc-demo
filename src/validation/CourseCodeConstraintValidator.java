package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefixes = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

        boolean result = false;
        if (theCode != null) {
            // loop through the course prefixes
            for (String tempPrefix : coursePrefixes) {
                result = theCode.startsWith(tempPrefix);
                // break the loop if we found a match
                if (result) break;
            }
        } else {
            result = true;
        }
        return result;
    }

}

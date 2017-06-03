/*
 * im providing with this class communication between low level and our steps
 * Web driver will be fully isolated and our steps will not know about driver at all, we are not using driver in steps.
 */
package helpers;

import ElementActions.Elements.Button;
import ElementActions.Elements.Input;
import ElementActions.Elements.Span;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author KUSEDU
 */
public class StepBase extends StateHolder {
    
    public static Button Button() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
         return (Button) CreateObject(Button.class);
    }
    
    public static Navigation Navigation() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
         return (Navigation) CreateObject(Navigation.class);
    }
    
    public static Input Input() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
         return (Input) CreateObject(Input.class);
    }
    
    public static Span Span() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
         return (Span) CreateObject(Span.class);
    }
}

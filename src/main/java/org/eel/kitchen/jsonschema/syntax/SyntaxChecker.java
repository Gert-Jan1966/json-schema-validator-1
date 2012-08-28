package org.eel.kitchen.jsonschema.syntax;

import com.fasterxml.jackson.databind.JsonNode;
import org.eel.kitchen.jsonschema.main.ValidationMessage;

import java.util.List;

/**
 * Interface implemented by all syntax checkers
 *
 * <p>There exists one syntax checker per supported schema keyword. For the
 * recall, their role is to ensure the keyword values are well formed, so as to
 * ease the job of the associated keyword validator.</p>
 *
 * <p>You have the option to directly implement this interface, however there
 * exist a number of classes which you can extend.</p>
 *
 * @see SimpleSyntaxChecker
 * @see PositiveIntegerSyntaxChecker
 * @see ArrayChildrenSyntaxChecker
 */
public interface SyntaxChecker
{
    /**
     * Check the syntax for this keyword
     *
     * @param messages message list to fill in the event of a failure
     * @param schema schema to analyze
     */
    abstract void checkSyntax(final ValidationMessage.Builder msg,
        final List<ValidationMessage> messages, final JsonNode schema);
}

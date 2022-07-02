package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectedActionsTest {

    @Test
    void isValidAction() {
        boolean actual = new SelectedActions().isValidAction(9);
        assertFalse(actual);
    }
}
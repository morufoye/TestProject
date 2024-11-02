package org.example;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class EmployeeRetro {
    private String employeeId;
    List<Map<String, Date>> retroDetail;
    private boolean isFulfilled;

    private class Retro {
        private String employeeId;
        private Date payrollStart;
        private Date payrollEnd;
        private boolean isFulfilled;
    }
}


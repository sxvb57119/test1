package com.antra.evaluation.reporting_system.utility.group;

import javax.validation.GroupSequence;

@GroupSequence({ValidateNotNull.class, ValidateFormat.class})
public interface GenericGroup {
}

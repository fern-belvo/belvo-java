package com.belvo.api.resources.employmentrecords;

import com.belvo.api.resources.employmentrecords.requests.DetailEmploymentRecordRequest;
import com.belvo.api.resources.employmentrecords.requests.EmploymentRecordRequest;
import com.belvo.api.resources.employmentrecords.requests.ListEmploymentRecordsRequest;
import com.belvo.api.types.EmploymentRecord;
import com.belvo.api.types.EmploymentRecordsPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface EmploymentRecordsClient {
  EmploymentRecordsPaginatedResponse listEmploymentRecords(ListEmploymentRecordsRequest request);

  List<EmploymentRecord> retrieveEmploymentRecordDetails(EmploymentRecordRequest request);

  EmploymentRecord detailEmploymentRecord(String id, DetailEmploymentRecordRequest request);

  void destroyEmploymentRecord(String id);
}

package com.project.jobportal.services;

<<<<<<< HEAD
import com.project.jobportal.entity.*;
import com.project.jobportal.repository.JobPostActivityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

=======
import com.project.jobportal.entity.JobPostActivity;
import com.project.jobportal.repository.JobPostActivityRepository;
import org.springframework.stereotype.Service;

>>>>>>> 90f8afba7cc514010cd0d0fb2c72c04229c2fb2e
@Service
public class JobPostActivityService {

    private final JobPostActivityRepository jobPostActivityRepository;

<<<<<<< HEAD
=======

>>>>>>> 90f8afba7cc514010cd0d0fb2c72c04229c2fb2e
    public JobPostActivityService(JobPostActivityRepository jobPostActivityRepository) {
        this.jobPostActivityRepository = jobPostActivityRepository;
    }

<<<<<<< HEAD
    public JobPostActivity addNew(JobPostActivity jobPostActivity) {
        return jobPostActivityRepository.save(jobPostActivity);
    }

    public List<RecruiterJobsDto> getRecruiterJobs(int recruiter) {

        List<IRecruiterJobs> recruiterJobsDtos = jobPostActivityRepository.getRecruiterJobs(recruiter);

        List<RecruiterJobsDto> recruiterJobsDtoList = new ArrayList<>();

        for (IRecruiterJobs rec : recruiterJobsDtos) {
            JobLocation loc = new JobLocation(rec.getLocationId(), rec.getCity(), rec.getState(), rec.getCountry());
            JobCompany comp = new JobCompany(rec.getCompanyId(), rec.getName(), "");
            recruiterJobsDtoList.add(new RecruiterJobsDto(rec.getTotalCandidates(), rec.getJob_post_id(),
                    rec.getJob_title(), loc, comp));
        }
        return recruiterJobsDtoList;

    }
}
=======
    public JobPostActivity addNew(JobPostActivity jobPostActivity){
        return jobPostActivityRepository.save(jobPostActivity);
    }
}
>>>>>>> 90f8afba7cc514010cd0d0fb2c72c04229c2fb2e

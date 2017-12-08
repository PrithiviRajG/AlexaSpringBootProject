/**
 * 
 */
package com.vocabBrawlAlexa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.SFacultyCode;

/**
 * @author Prithivi
 *
 */
public interface IFacultyCodeDao  extends IDataAccessObject, JpaRepository<SFacultyCode, String> {

	@Query("select count(id.facultyCode) from SFacultyCode where id.facultyCode=:facultyCode "
			+ " and activeFlag='Y' ")
	Long countByFacultyCode(@Param("facultyCode") String facultyCode);

	SFacultyCode findByFacultyCode(String upperCase);

	@Query("select count(id.facultyCode) from SFacultyCode where id.facultyCode=:decodedPromoCode "
			+ " and activeFlag='Y' ")
	Long countPromoCode(@Param("decodedPromoCode") String decodedPromoCode);

	@Query("select count(sfc.id.facultyCode) from SFacultyCode sfc, SExamFacultyMapping sefm where sfc.studentId=:userId "
			+ " and sfc.batchId=sefm.id.batchId and sefm.id.examId=:examId and sfc.activeFlag='N' ")
	Long countPremiumUser(@Param("userId") String userId, @Param("examId")  Integer examId);

}

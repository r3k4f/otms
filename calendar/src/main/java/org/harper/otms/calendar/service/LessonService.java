package org.harper.otms.calendar.service;

import org.harper.otms.calendar.service.dto.CancelLessonDto;
import org.harper.otms.calendar.service.dto.ChangeLessonStatusDto;
import org.harper.otms.calendar.service.dto.ChangeLessonStatusResponseDto;
import org.harper.otms.calendar.service.dto.ConfirmCancelDto;
import org.harper.otms.calendar.service.dto.GetLessonDto;
import org.harper.otms.calendar.service.dto.GetLessonHistoryDto;
import org.harper.otms.calendar.service.dto.GetLessonHistoryResponseDto;
import org.harper.otms.calendar.service.dto.GetLessonItemDto;
import org.harper.otms.calendar.service.dto.GetLessonItemResponseDto;
import org.harper.otms.calendar.service.dto.GetLessonResponseDto;
import org.harper.otms.calendar.service.dto.GetOngoingLessonDto;
import org.harper.otms.calendar.service.dto.GetOngoingLessonResponseDto;
import org.harper.otms.calendar.service.dto.GetRequestedLessonDto;
import org.harper.otms.calendar.service.dto.GetRequestedLessonResponseDto;
import org.harper.otms.calendar.service.dto.MakeLessonItemDto;
import org.harper.otms.calendar.service.dto.MakeLessonItemResponseDto;
import org.harper.otms.calendar.service.dto.SetupLessonDto;
import org.harper.otms.calendar.service.dto.SetupLessonResponseDto;
import org.harper.otms.calendar.service.dto.TriggerLessonDto;
import org.harper.otms.calendar.service.dto.TriggerLessonResponseDto;

public interface LessonService {

	/**
	 * Retrieve a lesson
	 * 
	 * @param request
	 * @return
	 */
	GetLessonResponseDto getLesson(GetLessonDto request);

	/**
	 * Retrieve lesson item
	 * 
	 * @param request
	 * @return
	 */
	GetLessonItemResponseDto getLessonItem(GetLessonItemDto request);

	/**
	 * Make a lesson item from its lesson
	 * 
	 * @param request
	 * @return
	 */
	MakeLessonItemResponseDto makeLessonItem(MakeLessonItemDto request);

	/**
	 * Client setup meeting with tutor
	 * 
	 * @param request
	 */
	SetupLessonResponseDto setupLesson(SetupLessonDto request);

	/**
	 * 
	 * @param request
	 * @return
	 */
	GetRequestedLessonResponseDto getRequestedLessons(
			GetRequestedLessonDto request);

	/**
	 * 
	 * @param request
	 * @return
	 */
	GetOngoingLessonResponseDto getOngoingLessons(GetOngoingLessonDto request);

	/**
	 * 
	 * @param request
	 * @return
	 */
	GetLessonHistoryResponseDto getLessonHistory(GetLessonHistoryDto request);

	/**
	 * 
	 * @param request
	 * @return
	 */
	ChangeLessonStatusResponseDto changeLessonStatus(
			ChangeLessonStatusDto request);

	/**
	 * Both client and tutor can propose the cancellation of a meeting. Client
	 * can directly cancel a meeting Tutor always need to get approval from
	 * client to cancel a meeting
	 * 
	 * @param request
	 */
	void cancelLesson(CancelLessonDto request);

	/**
	 * Client confirm tutor's request of canceling a meeting or a item
	 * 
	 * @param request
	 */
	void confirmCancel(ConfirmCancelDto request);

	/**
	 * Trigger a given lesson at specific time. This is generally achieved via a
	 * scheduler service and is not intended to be invoked by user
	 */
	TriggerLessonResponseDto triggerLesson(TriggerLessonDto request);

}

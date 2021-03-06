otms.namespace('otms.dashboardPage');

otms.dashboardPage.todoMessage = {
	"CLIENT_FEEDBACK" : "Comment on the lesson <span class='list_row_title'>{0}</span> you have attended with <a onclick='tutor_clicked(event, {5})'>{1}</a>, {3} to {4}, {2}"
};

function todo_renderer(container, item) {
	item.context = otms.json(item.context);
	var msg = otms.dashboardPage.todoMessage[item.type];
	var date = new Date(item.context.lessonFrom);
	var dateTo = new Date(item.context.lessonTo);

	var data = otms.FormatUtil.format(msg, item.context.lessonTitle,
			item.context.lessonWith, otms.DateUtil.formatdate(date),
			otms.DateUtil.formattime(date), otms.DateUtil.formattime(dateTo),
			item.context.lessonTutorId);
	container.append(data);
};

function todoClicked(event, dataitem) {
	switch (dataitem.type) {
	case 'CLIENT_FEEDBACK':
		otms.setPageParam('otms.feedbackPage.itemId', dataitem.refId);
		window.location = 'client_feedback.html';
	default:
		break;
	}
};
package com.example.app.chat.chat.service;

import com.example.app.chat.chat.dto.ReqPrivateMessageDTO;
import com.example.app.chat.chat.dto.ResChatPreviewDTO;
import com.example.app.chat.chat.dto.ResMessageDTO;
import com.example.app.chat.library.utils.PageResponse;

public interface ChatService {

    /**
     * Tạo một tin nhắn riêng tư
     *
     * @param reqPrivateMessageDTO Thông tin tin nhắn riêng tư
     */
    void createMessagePrivate(ReqPrivateMessageDTO reqPrivateMessageDTO);

    /**
     * Lấy danh sách các cuộc trò chuyện của người dùng
     *
     * @param userId ID của người dùng
     * @return Danh sách các cuộc trò chuyện
     */
    PageResponse<ResChatPreviewDTO> getListChatPreview(Long userId, int pageNo, int pageSize);

    /**
     * Lấy thông tin cuộc trò chuyện theo ID
     *
     * @param chatId ID của cuộc trò chuyện
     * @param pageNo Số trang
     * @param pageSize Kích thước trang
     * @return Thông tin cuộc trò chuyện
     */
    PageResponse<ResMessageDTO> getChatById(String chatId, int pageNo, int pageSize);
}

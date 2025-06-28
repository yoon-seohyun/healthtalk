# 📝헬스장 커뮤니티 게시판 만들기
헬스장 이용회원들이 헬스장 이용에 도움을 주는 게시판 서비스를 제공하는 헬스장 커뮤니티 어플리케이션입니다. 

### ✅프로젝트 기능 및 설계
- 회원가입 기능
  -  사용자는 회원가입을 하여 USER 권한을 받는다. 
  - 회원가입 시 아이디와 패스워드, 전화번호를 입력 받고 아이디와 전화번호는 unique 해야한다. 
- 로그인 기능
  - 사용자는 로그인을 할 수 있다. 로그인 시 사용한 아이디와 패스워드가 일치해야한다. 
- 실시간 이용인원 수 확인 기능
  - 로그인하지 않은 사용자를 포함한 모든 사용자는 핼스장의  “입장” 이벤트 수신 시 카운트를 +1, “퇴장” 이벤트 수신 시 카운트를 –1 하여 현재 이용인원 수를 집계하여 실시간 사용 인원 수를 확인 할 수 있다.
- 등록 회원 게시글 작성 기능
  - 로그인 및 헬스장 이용권 구매 회원은 게시판에 글을 작성할 수 있다.
  - 사용자는 게시글 제목, 게시글 내용을 작성 할 수 있다.
- 댓글 작성 기능
  - 로그인 및 헬스장 이용권 구매 회원은 “댓글 작성” 요청을 전송하면 서버는 로그인 상태와 이용권 구매 여부를 검증한 후 요청 본문에서 댓글 내용과 작성 대상을 추출하여 데이터베이스에 새로운 댓글 레코드를 생성하고, 생성된 댓글 정보를 응답으로 반환한다.
- 댓글 목록 조회 기능
  - 사용자가 “댓글 목록 조회” 요청을 전송하면 서버는 해당 게시글의 댓글을 지정된 페이징 기준(예: 최신순, 페이지 번호·크기)으로 조회하여 리스트 형태로 반환한다.

# ERD
![health erd](https://github.com/user-attachments/assets/a5357137-c071-478e-a3b7-8af9cbe6f2ad)

# Tech Stack
<img src="https://github.com/user-attachments/assets/2fd5d945-1144-4841-aa7f-010cfe7f01dc" alt="image" width="10%" />
<img src="https://github.com/user-attachments/assets/ac512551-3e5c-423d-839e-26b090f0dbbb" alt="image" width="10%" />
<img src="https://github.com/user-attachments/assets/7b26b265-8895-4f51-b81f-a05329a481f2" alt="image" width="10%" />
<img src="https://github.com/user-attachments/assets/9e498f10-6b14-4cf0-8de6-386f97d3e38a" alt="image" width="10%" />











